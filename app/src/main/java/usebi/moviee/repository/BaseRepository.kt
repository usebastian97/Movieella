package usebi.moviee.repository


import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Call

abstract class BaseRepository {

    protected suspend fun <Type> loadCall(
        call: () -> Call<Type>,
        result: MutableLiveData<Type>,
        errorText: (String) -> Unit
    ) =
        withContext(Dispatchers.IO) {

        }
}
