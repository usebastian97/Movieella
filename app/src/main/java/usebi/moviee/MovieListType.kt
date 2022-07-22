package usebi.moviee

enum class MovieListType {

    POPULAR {
        override fun toString() = "Popular"
    },
    UPCOMING {
        override fun toString() = "Upcoming"
    },
    IN_THEATERS {
        override fun toString() = "In Theaters"
    },
    ANIMATION {
        override fun toString(): String {
            return "Animation"
        }
    }
}