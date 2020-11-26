package com.example.retrofit

import POKEMON
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object NetworkPoint{
    val Pokemon: PlaceHolderApi
    get() = RetrofitClient.retrofit?.create(PlaceHolderApi::class.java)!!


}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NetworkPoint.Pokemon.addBook("3").enqueue(object : Callback<POKEMON> {
            override fun onResponse(call: Call<POKEMON>, response: Response<POKEMON>) {
                Log.d("RETROFIT", response.body().toString())
            }

            override fun onFailure(call: Call<POKEMON>, t: Throwable) {

            }
        })
    }
}