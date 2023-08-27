package pat.project.vodovossample.dto.products.response


import com.google.gson.annotations.SerializedName

data class AllProductsResponse(
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: ResponseStatusType,
    @SerializedName("TOVARY")
    val products: Array<ProductsCategoriesResponse>
)