package murtuza.weather.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import murtuza.weather.data.network.WeatherApi
import murtuza.weather.data.repository.DefaultWeatherRepository
import murtuza.weather.data.repository.WeatherRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository(weatherApi: WeatherApi): WeatherRepository =
        DefaultWeatherRepository(weatherApi)
}