package pat.project.vodovossample.sample.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import pat.project.vodovossample.Entity
import pat.project.vodovossample.sample.domain.entity.ProductsCategories
import pat.project.vodovossample.sample.domain.interactor.SampleScreenInteractor
import javax.inject.Inject

class SampleViewModel @Inject constructor(
    private val sampleScreenInteractor: SampleScreenInteractor
) : ViewModel() {

    private val _productsData = MutableStateFlow<List<ProductsCategories>>(emptyList())
    val productsData = _productsData.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            when(val res = sampleScreenInteractor.getProductsData()){
                is Entity.Success -> {
                    _productsData.value = res.data
                }
                is Entity.Error -> {
                    _productsData.value = emptyList()
                }

            }
        }
    }

}