package pat.project.vodovossample.sample.domain.entity

data class ProductsCategories(
    val data: List<ProductItemDomain>,
    val categoryName: String
)

data class ProductItemDomain(
    val pictureUrl: String,
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
