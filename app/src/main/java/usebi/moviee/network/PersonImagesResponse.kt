package usebi.moviee.network

import android.media.Image
import com.google.gson.annotations.SerializedName

data class PersonImagesResponse(
    @SerializedName("profiles")
    override var results: List<Image>
): BaseListResponse<Image>
