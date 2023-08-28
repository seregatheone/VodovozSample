package pat.project.vodovossample.data.mappers.sample

import pat.project.vodovossample.dto.products.response.ProductItemResponse
import pat.project.vodovossample.dto.products.response.ProductPriceResponse
import pat.project.vodovossample.dto.products.response.ProductsCategoriesResponse
import pat.project.vodovossample.sample.domain.entity.ProductItemDomain
import pat.project.vodovossample.sample.domain.entity.ProductPrice
import pat.project.vodovossample.sample.domain.entity.ProductsCategories

fun Array<ProductsCategoriesResponse>.asEntity(host: String): List<ProductsCategories> {
    return map {
        it.asEntity(host)
    }
}

fun ProductsCategoriesResponse.asEntity(host: String): ProductsCategories {
    return ProductsCategories(
        data = data.asEntity(host),
        categoryName = categoryName,
    )
}

fun Array<ProductItemResponse>.asEntity(host: String): List<ProductItemDomain> {
    return map {
        it.asEntity(host)
    }
}

fun ProductItemResponse.asEntity(host: String): ProductItemDomain {
    return ProductItemDomain(
        pictureUrl = host + picture,
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