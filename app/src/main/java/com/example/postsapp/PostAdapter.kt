package com.example.postsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(var postlist:List<Post>):
RecyclerView.Adapter<PostsViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.post_details, parent, false)
        return  PostsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder:PostsViewHolder, position: Int) {
        val post = postlist[position]
        holder.body.text = post.body
        holder.title.text = post.title
        holder.userid.text = "UserID: ${post.useId}"
        holder.id.text = "ID: ${post.id}"
    }

    override fun getItemCount(): Int {
        return postlist.size


    }

}







class PostsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var body  =itemView.findViewById<TextView>(R.id.rtbody)
    var title = itemView.findViewById<TextView>(R.id.rtTitle)
    var  userid = itemView.findViewById<TextView>(R.id.rtUserid)
    var id = itemView.findViewById<TextView>(R.id.rvid)

}