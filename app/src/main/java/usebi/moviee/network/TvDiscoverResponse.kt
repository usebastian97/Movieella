package usebi.moviee.network

import com.google.gson.annotations.SerializedName
import usebi.moviee.entity.TvSeries

data class TvDiscoverResponse(
    @SerializedName("page")
    override var page: Int,

    @SerializedName("results")
    override var results: List<TvSeries>
) : BasePageListResponse<TvSeries>
