package pat.project.vodovossample.dto.products.response


import com.google.gson.annotations.SerializedName

data class ProductItemResponse(
    @SerializedName("DETAIL_PICTURE")
    val picture: String,
    @SerializedName("EXTENDED_PRICE")
    val price: Array<ProductPriceResponse>,
    @SerializedName("FAVORITE")
    val favorite: Boolean,
)