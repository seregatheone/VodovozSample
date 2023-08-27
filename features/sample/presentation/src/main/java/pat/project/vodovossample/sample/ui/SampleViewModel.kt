package pat.project.vodovossample.sample.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import pat.project.vodovossample.sample.domain.interactor.SampleScreenInteractor
import javax.inject.Inject

class SampleViewModel @Inject constructor(
    private val sampleScreenInteractor: SampleScreenInteractor
) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {

        }
    }

}