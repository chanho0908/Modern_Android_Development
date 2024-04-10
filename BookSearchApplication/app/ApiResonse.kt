
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiResonse(
    @Json(name = "GGEXPSDLV")
    val gGEXPSDLV: GGEXPSDLVX
)