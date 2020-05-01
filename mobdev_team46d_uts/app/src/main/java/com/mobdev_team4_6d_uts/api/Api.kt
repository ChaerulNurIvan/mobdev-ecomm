package com.mobdev_team4_6d_uts.api

import com.mobdev_team4_6d_uts.models.DefaultResponse
import com.mobdev_team4_6d_uts.models.LoginResponse
import com.mobdev_team4_6d_uts.models.ShopResponse
import retrofit2.Call
import retrofit2.http.*

interface Api {
    @FormUrlEncoded
    @POST("register")
    fun register(
        @Field("name") name :String,
        @Field("email") email : String,
        @Field("password") password : String,
        @Field("c_password") C_password : String
    ): Call<DefaultResponse>

    @FormUrlEncoded
    @POST("login")
    fun userLogin(
        @Field("email") email:String,
        @Field("password") password: String
    ):Call<LoginResponse>

    @GET("shop")
    fun getShop(@Header("api_token") value: String): Call<ShopResponse>
}