package com.example.hyunwook.weathercast.data

import com.google.gson.annotations.SerializedName

/**
 * Created by hyunwook on 2018-04-29.
 */

//날씨 정보 data 클래스

data class DayData(val weather: ArrayList<WeatherData>, val main: MainData, val wind: WindData,
        val clouds: CloudData, val rain: RainData, var cityName: String, var api_id: String) {

    //연산자
    operator fun get(position: Int): WeatherData = weather[position]
}

data class WeekData(val list: ArrayList<WeekData>)

data class WeeakList (val dt: String, val weather :ArrayList<WeatherData>, val main: MainData,
                      val clouds: CloudData, val dt_txt: String)

data class WeatherData(val main: String, val description: String, val icon: String)

data class MainData(val temp: String, val temp_min: String, val temp_max: String, val humidity: String)

data class CloudData(val all: String)
data class RainData(@SerializedName("3h") val rain: Int)

data class WindData(val Speed: String)

data class WeatherForecast(val current: DayData, val week: WeekData, val uconUrl: String)
}