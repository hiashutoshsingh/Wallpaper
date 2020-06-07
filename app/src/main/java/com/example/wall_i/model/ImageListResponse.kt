import com.example.wall_i.model.ImageResponse
import com.google.gson.annotations.SerializedName

data class ImageListResponse(

    @SerializedName("total") val total: Int,
    @SerializedName("totalHits") val totalHits: Int,
    @SerializedName("hits") val imageList: List<ImageResponse>
)