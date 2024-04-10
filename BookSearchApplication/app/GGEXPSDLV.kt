
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GGEXPSDLV(
    @Json(name = "head")
    val head: Head,
    @Json(name = "row")
    val row: List<Row>
)