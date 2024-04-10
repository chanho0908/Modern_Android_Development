
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiResponse(
    @Json(name = "GGEXPSDLV")
    val gGEXPSDLV: GGEXPSDLV
)