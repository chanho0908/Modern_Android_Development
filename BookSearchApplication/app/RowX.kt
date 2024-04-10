
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RowX(
    @Json(name = "BIZREGNO")
    val bIZREGNO: String,
    @Json(name = "INDUTYPE_NM")
    val iNDUTYPENM: String,
    @Json(name = "REFINE_LOTNO_ADDR")
    val rEFINELOTNOADDR: String,
    @Json(name = "REFINE_ROADNM_ADDR")
    val rEFINEROADNMADDR: String,
    @Json(name = "REFINE_WGS84_LAT")
    val rEFINEWGS84LAT: String,
    @Json(name = "REFINE_WGS84_LOGT")
    val rEFINEWGS84LOGT: String,
    @Json(name = "REFINE_ZIPNO")
    val rEFINEZIPNO: String,
    @Json(name = "SIGUN_NM")
    val sIGUNNM: String,
    @Json(name = "STR_NM")
    val sTRNM: String
)