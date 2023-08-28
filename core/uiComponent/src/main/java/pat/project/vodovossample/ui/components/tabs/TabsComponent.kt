package pat.project.vodovossample.ui.components.tabs

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun TabsComponent(
    modifier: Modifier = Modifier,
    tabs: List<String> = emptyList(),
    state: Int = 0,
    onCLick: (Int) -> Unit = {}
) {
    LazyRow(
        modifier = modifier
    ) {
        itemsIndexed(tabs) { currentTab, tabValue ->
            Text(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(4.dp),
                    )
                    .border(
                        width = 1.dp,
                        shape = RoundedCornerShape(4.dp),
                        color = if (state == currentTab) Color.LightGray else Color.Black
                    )
                    .padding(horizontal = 6.dp, vertical = 3.dp)
                    .clickable {
                        onCLick(currentTab)
                    },
                textAlign = TextAlign.Center,
                text = tabValue,
                color = if (state == currentTab) Color.Blue else Color.Black
            )
        }
    }

}
