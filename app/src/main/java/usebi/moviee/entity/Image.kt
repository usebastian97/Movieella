package usebi.moviee.entity

import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("file_path")
    var filePath: String
)
