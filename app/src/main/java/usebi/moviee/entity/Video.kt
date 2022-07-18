package usebi.moviee.entity

import com.google.gson.annotations.SerializedName

data class Video(
    @SerializedName("id")
    var id: Int,

    @SerializedName("key")
    var key: String?,

    @SerializedName("name")
    var name: String,


)
