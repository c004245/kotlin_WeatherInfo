package com.example.hyunwook.weathercast

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.hyunwook.weathercast.data.CityArray
import com.google.gson.Gson
import java.io.InputStreamReader

/**
 * Created by hyunwook on 2018-04-17.
 * 도시 리스트 Activity
 */
class SelectCityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_city)

        val inputStream = InputStreamReader(assets.open("areaCode")) //areaCode파일읽기
        val cityData: CityArray = Gson().fromJson(inputStream, CityArray::class.java)

        val adapter = CityListAdapter(this, cityData.city)
        city_list.adapter
    }
} {
}