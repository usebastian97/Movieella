package usebi.moviee

data class Popular(
    val page: Int,
    val results: List<Result>,
    val totalPages: Int,
    val totalResults: Int
)
