package pat.project.vodovossample.ui.components.tabs

sealed class TabItem{
    abstract class ProductItem(
        val tabPhotoUrl : String,
        val tabProductCost : Int,
        val tabCurrency : String,
        val tabIsFavorite : Boolean
    ) : TabItem()
}
