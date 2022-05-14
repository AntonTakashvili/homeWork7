package com.example.homework7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.homework7.api.Post_Class
import com.example.homework7.api.ReqData
import com.example.homework7.api.RestClient
import com.example.homework7.api.User
import com.example.homework7.api.ReqresApi
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getUserbyId()
        val character = Post_Class(1,"something",2000)
        posti(character)









        RestClient.getReqResApi.getUsers(1).enqueue(object:retrofit2.Callback<ReqData<List<User>>>{
            override fun onResponse(
                call: Call<ReqData<List<User>>>,
                response: Response<ReqData<List<User>>>
            ) {
                if (response.isSuccessful && response.body() != null) {
                    response.body()!!.data?.forEach { user -> Log.d("MyData", user.toString()) }
                }
            }

            override fun onFailure(call: Call<ReqData<List<User>>>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })

    }
    fun getUserbyId() {
        RestClient.getReqResApi.GetUserById(1)
            .enqueue(object : retrofit2.Callback<ReqData<User>> {


                override fun onResponse(
                    call: Call<ReqData<User>>,
                    response: Response<ReqData<User>>
                ) {
                    TODO("Not yet implemented")
                }

                override fun onFailure(call: Call<ReqData<User>>, t: Throwable) {
                    TODO("Not yet implemented")
                }
            })
    }

    fun posti(Post1:Post_Class) {
        RestClient.getReqResApi.Posti(Post1)
            .enqueue(object : retrofit2.Callback<Post_Class> {
                override fun onResponse(call: Call<Post_Class>, response: Response<Post_Class>) {
                    TODO("Not yet implemented")
                }

                override fun onFailure(call: Call<Post_Class>, t: Throwable) {
                    TODO("Not yet implemented")
                }


            })
    }
}