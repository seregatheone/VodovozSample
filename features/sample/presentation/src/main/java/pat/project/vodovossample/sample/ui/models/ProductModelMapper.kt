package pat.project.vodovossample.sample.ui.models

import pat.project.vodovossample.sample.domain.entity.ProductItemDomain
import pat.project.vodovossample.sample.domain.entity.ProductPrice
import pat.project.vodovossample.ui.components.tabs.rowitems.RowItem

fun ProductItemDomain.asProductItemRow(): RowItem.ProductItemRow {
    return RowItem.ProductItemRow(
        rowPhotoUrl = pictureUrl,
        rowProductCost = price?.price ?: 0,
        rowCurrency = "P",
        rowIsFavorite = favorite,
    )
}

fun RowItem.ProductItemRow.asProductItemRow(): ProductItemDomain {
    return ProductItemDomain(
        pictureUrl = rowPhotoUrl,
        price = ProductPrice(price = rowProductCost),
        favorite = rowIsFavorite,
    )
}