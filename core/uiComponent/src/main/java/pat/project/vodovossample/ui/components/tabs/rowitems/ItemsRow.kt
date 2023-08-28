package pat.project.vodovossample.ui.components.tabs.rowitems

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import pat.project.vodovossample.ui.components.tabs.rowitems.product.ProductItem

@Composable
inline fun <reified T : RowItem> ItemsRow(
    modifier: Modifier = Modifier,
    itemsList: List<T>,
) {
    LazyRow(
        modifier
            .fillMaxWidth()
            .padding(top = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        when (T::class.java) {
            RowItem.ProductItemRow::class.java -> {
                items(itemsList) { item ->
                    ProductItem(product = item as RowItem.ProductItemRow)
                }
            }

            else -> {}

        }
    }
}


