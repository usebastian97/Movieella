package usebi.moviee.network

import com.google.gson.annotations.SerializedName
import usebi.moviee.entity.Video

data class VideosResponse(
    @SerializedName("results")
    override var results: List<Video>
): BaseListResponse<Video>