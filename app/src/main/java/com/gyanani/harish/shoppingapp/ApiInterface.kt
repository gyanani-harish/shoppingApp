package com.gyanani.harish.shoppingapp

import com.gyanani.harish.shoppingapp.models.ProductsApiResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("/products")
    fun getProducts(@Query("page") pageNo: Int): Call<ProductsApiResponse>
}