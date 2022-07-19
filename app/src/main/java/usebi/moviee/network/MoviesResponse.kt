package usebi.moviee.network

import com.google.gson.annotations.SerializedName
import usebi.moviee.entity.Movie


// The code above declares a variable called results and sets it to the list of all movies in the database.
data class MoviesResponse(
    @SerializedName("page") override var page: Int,

    @SerializedName("results") override var results: List<Movie>
): BasePageListResponse<Movie>
