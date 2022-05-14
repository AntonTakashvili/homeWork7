package com.example.homework7.api

import com.google.gson.annotations.SerializedName

data class User (
    val id: Long?,
    @SerializedName("email")
    val Email:String?,

    @SerializedName("first_name")
    val firstName:String?,

    @SerializedName("last_name")
    val lastName:String?
)

data class ReqData<T>(

    val page:Int?,

    val per_page:Int?,

    val total_pages:Int?,
    val data:T?
)