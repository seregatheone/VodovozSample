package pat.project.vodovossample.sample.domain.entity

data class ProductsCategories(
    val data: List<ProductItem>,
    val categoryName: String
)

data class ProductItem(
    val picture: String,
    val price: ProductPrice?,
    val favorite: Boolean,
)

data class ProductPrice(
    val price: Int,
)
enum class StatusType{
    SUCCESS,
    ERROR,
}
