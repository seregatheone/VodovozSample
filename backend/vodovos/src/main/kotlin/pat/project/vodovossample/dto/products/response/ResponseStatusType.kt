package pat.project.vodovossample.dto.products.response

import com.google.gson.annotations.SerializedName

enum class ResponseStatusType{
    @SerializedName("Success", alternate = ["SUCCESS", "success"])
    SUCCESS,
    @SerializedName("Error", alternate = ["ERROR", "error"])
    ERROR,
}
