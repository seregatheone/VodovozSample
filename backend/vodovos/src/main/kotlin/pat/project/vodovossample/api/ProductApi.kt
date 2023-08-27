package pat.project.vodovossample.api

import pat.project.vodovossample.dto.products.response.AllProductsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ProductApi {
    @GET("newmobile/glavnaya/super_top.php")
    suspend fun getAllProducts(
        @Query("action") action : String? = "topglav"
    ): AllProductsResponse
}