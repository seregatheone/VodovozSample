package pat.project.vodovossample.ui.components.tabs.rowitems.product

import android.graphics.fonts.FontStyle
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import pat.project.vodovossample.ui.components.tabs.rowitems.RowItem

@Composable
fun ProductItem(
    modifier: Modifier = Modifier,
    product: RowItem.ProductItemRow
) {
    Box(
        modifier = modifier
            .width(140.dp)
            .height(180.dp)
            .shadow(1.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(product.rowPhotoUrl)
                .crossfade(true)
                .build(),
            onError = {
                Log.i("ERROR", "PHOTO - ERROR")
            },
            modifier = Modifier
                .fillMaxSize(),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )

        Text(
            modifier = Modifier.align(Alignment.BottomStart),
            fontWeight = FontWeight.Bold,
            text = product.rowProductCost.toString() + " P"
        )
        Icon(
            modifier = Modifier.align(Alignment.TopEnd),
            imageVector = if (product.rowIsFavorite) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
            contentDescription = null
        )

        Icon(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .size(26.dp),
            imageVector = Icons.Filled.ShoppingCart,
            tint = Color(0xFF93C572),
            contentDescription = null
        )

    }

}