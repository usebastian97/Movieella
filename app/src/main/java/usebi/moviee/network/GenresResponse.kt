package usebi.moviee.network

import com.google.gson.annotations.SerializedName
import usebi.moviee.entity.Genre

data class GenresResponse(
    @SerializedName("genres")
    override var results: List<Genre>

) : BaseListResponse<Genre>