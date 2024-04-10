
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RESULTX(
    @Json(name = "CODE")
    val cODE: String,
    @Json(name = "MESSAGE")
    val mESSAGE: String
)