
package com.raywenderlich.android.watchlist

import android.app.Application
import timber.log.Timber
import timber.log.Timber.DebugTree

class MovieApp: Application() {
  override fun onCreate() {
    super.onCreate()

    if (BuildConfig.DEBUG) {
      Timber.plant(DebugTree())
    }
  }
}
