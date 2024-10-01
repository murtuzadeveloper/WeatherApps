package murtuza.weather

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import kamal.aishwarya.weather.BuildConfig
import timber.log.Timber
import timber.log.Timber.Forest.plant

@HiltAndroidApp
class WeatherApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            plant(Timber.DebugTree())
        }
    }
}