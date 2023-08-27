package pat.project.vodovossample.data.mappers.sample

import pat.project.vodovossample.dto.products.response.ProductItemResponse
import pat.project.vodovossample.dto.products.response.ProductPriceResponse
import pat.project.vodovossample.dto.products.response.ProductsCategoriesResponse
import pat.project.vodovossample.sample.domain.entity.ProductItem
import pat.project.vodovossample.sample.domain.entity.ProductPrice
import pat.project.vodovossample.sample.domain.entity.ProductsCategories

fun Array<ProductsCategoriesResponse>.asEntity(): List<ProductsCategories> {
    return map {
        it.asEntity()
    }
}

fun ProductsCategoriesResponse.asEntity(): ProductsCategories {
    return ProductsCategories(
        data = data.asEntity(),
        categoryName = categoryName,
    )
}

fun Array<ProductItemResponse>.asEntity(): List<ProductItem> {
    return map {
        it.asEntity()
    }
}

fun ProductItemResponse.asEntity(): ProductItem {
    return ProductItem(
        picture = picture,
        price = price.asEntity(),
        favorite = favorite,
    )
}

fun Array<ProductPriceResponse>.asEntity(): ProductPrice? {
    val last = lastOrNull()
    return last?.let {
        ProductPrice(
            price = last.price
        )
    }
}