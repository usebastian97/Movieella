package usebi.moviee.network

interface BasePageListResponse<T> {
    var page: Int
    var results: List<T>
}