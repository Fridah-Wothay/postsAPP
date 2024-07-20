package com.example.postsapp

import android.telecom.Call
import retrofit2.http.GET

interface PostApiInterface {
    @GET("/Posts")
    fun fetchPosts(): retrofit2.Call<List<Post>>


}