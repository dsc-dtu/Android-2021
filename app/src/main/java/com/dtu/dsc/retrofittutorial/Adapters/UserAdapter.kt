package com.dtu.dsc.retrofittutorial.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dtu.dsc.retrofittutorial.Models.UserItem
import com.dtu.dsc.retrofittutorial.R
import kotlinx.android.synthetic.main.list_item.view.*

class UserAdapter(
    var context: Context,
    var userList: List<UserItem>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: UserItem) {
            Glide.with(itemView.context).load(user.avatar_url).into(itemView.imageView)
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