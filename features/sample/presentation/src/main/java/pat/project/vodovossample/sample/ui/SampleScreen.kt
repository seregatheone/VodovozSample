package pat.project.vodovossample.sample.ui


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import pat.project.vodovossample.sample.ui.models.asProductItemRow
import pat.project.vodovossample.ui.components.tabs.TabsComponent
import pat.project.vodovossample.ui.components.tabs.rowitems.ItemsRow
import pat.project.vodovossample.ui.components.tabs.rowitems.RowItem

@Composable
fun SampleScreen(
    sampleViewModel: SampleViewModel,
){

    val productsData by sampleViewModel.productsData.collectAsState()
    var currentTab by remember{ mutableStateOf(0) }

    Column(modifier = Modifier.fillMaxSize()
        .padding(horizontal = 12.dp)){
        TabsComponent(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 120.dp),
            tabs = productsData.map { it.categoryName },
            state = currentTab,
            onCLick = { newTab ->
                currentTab = newTab
            }
        )

        ItemsRow(
            modifier = Modifier.fillMaxWidth(),
            itemsList = productsData.getOrNull(currentTab)?.data?.map { it.asProductItemRow() }?: emptyList()
        )
    }
}
