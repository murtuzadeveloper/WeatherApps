package murtuza.weather.data.repository

import murtuza.weather.model.Weather
import murtuza.weather.utils.Result
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    fun getWeatherForecast(city: String): Flow<Result<Weather>>
}