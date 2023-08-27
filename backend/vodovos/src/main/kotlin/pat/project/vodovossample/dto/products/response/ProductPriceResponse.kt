package pat.project.vodovossample.dto.products.response


import com.google.gson.annotations.SerializedName

data class ProductPriceResponse(
    @SerializedName("PRICE")
    val price: Int,
)