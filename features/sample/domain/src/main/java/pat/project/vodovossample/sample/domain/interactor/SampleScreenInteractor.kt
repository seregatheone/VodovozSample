package pat.project.vodovossample.sample.domain.interactor

import pat.project.vodovossample.Entity
import pat.project.vodovossample.sample.domain.entity.ProductsCategories

interface SampleScreenInteractor{
    suspend fun getProductsData() : Entity<List<ProductsCategories>>
}