package com.example.hyunwook.weathercast

import android.content.Context
import android.support.v4.content.AsyncTaskLoader
import com.example.hyunwook.weathercast.data.CityData
import com.example.hyunwook.weathercast.data.WeatherForecast

/**
 * Created by hyunwook on 2018-04-29.
 */
class ForecastDataLoader(context: Context, val cities: ArrayList<CityData>) :
        AsyncTaskLoader<ArrayList<WeatherForecast>>(context) {

    val API_KEY = String = "2677d0da8acab2b1d91d54942d6914c8"
    val Currennt_URL  String = "http://api.openweathermap.org/data/2.5/weather?id="
    val Forcast_URL

}