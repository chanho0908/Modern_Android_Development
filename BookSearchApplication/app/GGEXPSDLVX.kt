
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GGEXPSDLVX(
    @Json(name = "head")
    val head: HeadX,
    @Json(name = "row")
    val row: List<RowX>
)