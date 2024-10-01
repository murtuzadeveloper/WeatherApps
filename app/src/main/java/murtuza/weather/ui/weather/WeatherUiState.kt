package murtuza.weather.ui.weather

import murtuza.weather.model.Weather

data class WeatherUiState(
    val weather: Weather? = null,
    val isLoading: Boolean = false,
    val errorMessage: String = "",
)
