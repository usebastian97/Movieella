package usebi.moviee

import androidx.lifecycle.MutableLiveData
import usebi.moviee.entity.*

interface GoToCast {
    val goToCastDetailsEvent: MutableLiveData<Event<Cast>>

    fun goTo(cast: Cast) {
        goToCastDetailsEvent.value = Event(cast)
    }
}

interface GoToImage {
    val goToImageEvent: MutableLiveData<Event<Image>>

    fun goTo(image: Image) {
        goToImageEvent.value = Event(image)
    }
}

interface GoToMovie {
    val goToMovieEvent: MutableLiveData<Event<Movie>>

    fun goTo(movie: Movie) {
        goToMovieEvent.value = Event(movie)
    }
}

interface GoToTvSeries {
    val goToTvSeriesEvent: MutableLiveData<Event<TvSeries>>

    fun goTo(tvSeries: TvSeries) {
        goToTvSeriesEvent.value = Event(tvSeries)
    }
}

interface GoToVideo {
    val goToVideoEvent: MutableLiveData<Event<Video>>

    fun goTo(video: Video) {
        goToVideoEvent.value = Event(video)
    }
}

interface GoToCredit {
    val goToCreditEvent: MutableLiveData<Event<Credit>>

    fun goTo(credit: Credit) {
        goToCreditEvent.value = Event(credit)
    }
}
