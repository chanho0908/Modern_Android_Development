
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class HeadX(
    @Json(name = "api_version")
    val apiVersion: String,
    @Json(name = "list_total_count")
    val listTotalCount: String,
    @Json(name = "RESULT")
    val rESULT: RESULTX
)