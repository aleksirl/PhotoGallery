package com.bignerdranch.android.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "9c4467a4aed0ddb0de98cf95eac3245f"
interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList" +
            "&api_key=$API_KEY" +
            "&format=json" +
            "&nojsoncallback=1" +
            "&extras=url_s")
    suspend fun fetchPhotos(): FlickrResponse
}