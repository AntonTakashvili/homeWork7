package com.example.homework7.api

import retrofit2.Call
import retrofit2.http.*

interface ReqresApi {

    @GET("users")
    fun getUsers(@Query("page")page:Int):Call<ReqData<List<User>>>

    @GET("users/{userId}")
    fun GetUserById(@Path("userId")userId:Int):Call<ReqData<User>>

    @POST("users")
    fun Posti(@Body Posti:Post_Class):Call<Post_Class>
    @GET("unknown/{resourceId}")
    fun getUsersByResourse(@Path("resourceId")resourceId:Int):Call<ReqData<User>>
    @PUT("users/{userId}")
    fun CreateUsers(@Path("userId")resourceId:Int):Call<Put_Class>

}