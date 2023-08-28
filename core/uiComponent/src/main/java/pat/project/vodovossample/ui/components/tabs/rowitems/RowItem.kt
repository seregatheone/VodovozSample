package pat.project.vodovossample.ui.components.tabs.rowitems

sealed class RowItem{
    data class ProductItemRow(
        val rowPhotoUrl : String,
        val rowProductCost : Int,
        val rowCurrency : String,
        val rowIsFavorite : Boolean
    ) : RowItem()
}
