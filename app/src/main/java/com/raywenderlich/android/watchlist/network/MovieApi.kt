
package com.raywenderlich.android.watchlist.network

import com.raywenderlich.android.watchlist.BuildConfig
import com.raywenderlich.android.watchlist.model.MovieApiResponse
import com.raywenderlich.android.watchlist.model.MovieDetailsModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApi {

  @GET("/3/movie/popular")
  fun getPopularMovies(): Call<MovieApiResponse>

  @GET("/3/movie/{id}")
  fun getMovieDetails(@Path("id") id: Long): Call<MovieDetailsModel>
}