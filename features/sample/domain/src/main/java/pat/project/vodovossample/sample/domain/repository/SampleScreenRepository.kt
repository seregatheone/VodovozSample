package pat.project.vodovossample.sample.domain.repository

import pat.project.vodovossample.Entity
import pat.project.vodovossample.sample.domain.entity.ProductsCategories


interface SampleScreenRepository {
    suspend fun getProductsData() : Entity<List<ProductsCategories>>
}