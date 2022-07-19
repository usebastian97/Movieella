package usebi.moviee.network

import com.google.gson.annotations.SerializedName
import usebi.moviee.entity.Cast

data class CreditsResponse(
    @SerializedName("cast")
    override var results: List<Cast>
) : BaseListResponse<Cast>
