package pat.project.vodovossample.dto.products.response


import com.google.gson.annotations.SerializedName

data class ProductsCategoriesResponse(
    @SerializedName("data")
    val data: Array<ProductItemResponse>,
    @SerializedName("NAME")
    val categoryName: String
)