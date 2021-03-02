package com.akshat.jindal.retrofittutorial

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akshat.jindal.retrofittutorial.Models.UserItem
import com.bumptech.glide.Glide
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

        RetrofitService.getAPIService().getUsers().enqueue(object : Callback<List<UserItem>> {
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

class UserAdapter(
    var context: Context,
    var userList: List<UserItem>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: UserItem) {
            Glide.with(itemView.context).load(user.avatarUrl).into(itemView.imageView)
            itemView.textViewTitle.text = user.login
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return UserViewHolder(
            LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        )
    }

    override fun getItemCount(): Int = userList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        (holder as UserViewHolder).bind(userList[position])
    }

}
