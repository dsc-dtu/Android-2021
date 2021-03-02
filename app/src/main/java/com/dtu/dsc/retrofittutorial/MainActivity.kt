package com.dtu.dsc.retrofittutorial

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.dtu.dsc.retrofittutorial.Adapters.UserAdapter
import com.dtu.dsc.retrofittutorial.Models.UserItem
import com.dtu.dsc.retrofittutorial.Networking.APIService
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        /**
         * Old and inefficient method due to static nature
         * */
        /*RetrofitService.getAPIService().getUsers().enqueue(object : Callback<List<UserItem>> {
            override fun onFailure(call: Call<List<UserItem>>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Error Occurred", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(
                call: Call<List<UserItem>>,
                response: Response<List<UserItem>>
            ) {
                if (response.isSuccessful) {
                    val userList = response.body()
                    recyclerView.adapter =
                        UserAdapter(context = this@MainActivity, userList = userList.orEmpty())
                }

            }
        })*/

        /**
         * new and efficient method as it does not create the object till it is used for the first time
         *
         * */
        APIService.API.getUsers().enqueue(object : Callback<List<UserItem>> {
            override fun onFailure(call: Call<List<UserItem>>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Error Occurred", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(
                call: Call<List<UserItem>>,
                response: Response<List<UserItem>>
            ) {
                if (response.isSuccessful) {
                    val userList = response.body()
                    recyclerView.adapter =
                        UserAdapter(context = this@MainActivity, userList = userList.orEmpty())
                }

            }
        })


    }
}
