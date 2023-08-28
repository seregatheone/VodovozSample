package pat.project.vodovossample.domain.interactors

import pat.project.vodovossample.Entity
import pat.project.vodovossample.sample.domain.entity.ProductsCategories
import pat.project.vodovossample.sample.domain.interactor.SampleScreenInteractor
import pat.project.vodovossample.sample.domain.repository.SampleScreenRepository


class SampleScreenInteractorImpl(
    private val repository: SampleScreenRepository
) : SampleScreenInteractor {
    override suspend fun getProductsData(): Entity<List<ProductsCategories>> {
        return repository.getProductsData()
    }

}
