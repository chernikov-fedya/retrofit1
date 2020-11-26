package com.example.retrofit

import POKEMON
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceHolderApi {
    @GET("berry/")
    fun addBook(@Query("id") id: String): Call<POKEMON>

}