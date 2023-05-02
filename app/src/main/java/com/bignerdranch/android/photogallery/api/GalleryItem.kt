package com.bignerdranch.android.photogallery.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.net.URI
import java.net.URL
@JsonClass (generateAdapter = true)
data class GalleryItem(
    val title: String,
    val id: String,
    @Json(name = "url_s") val url: String? = null

)







