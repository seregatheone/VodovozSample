package pat.project.vodovossample.data.repository

import android.util.Log
import pat.project.vodovossample.Entity
import pat.project.vodovossample.api.ProductApi
import pat.project.vodovossample.data.mappers.sample.asEntity
import pat.project.vodovossample.dto.products.response.ResponseStatusType
import pat.project.vodovossample.sample.domain.entity.ProductsCategories
import pat.project.vodovossample.sample.domain.repository.SampleScreenRepository

class SampleScreenRepositoryImpl(
    private val productApi: ProductApi,
    private val host : String
) : SampleScreenRepository {
    override suspend fun getProductsData(): Entity<List<ProductsCategories>> {
        val response = productApi.getAllProducts()
        return when (
            response.status
        ){
            ResponseStatusType.SUCCESS -> {
                Entity.Success(response.products.asEntity(host))
            }
            ResponseStatusType.ERROR -> {
                Entity.Error(
                    message = response.message
                )
            }
        }
    }

}
