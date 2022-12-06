// не было пакета
package com.example.filmprac.model

import com.google.gson.annotations.SerializedName

data class Films(

    @SerializedName("id") val id: Int,
    @SerializedName("localized_name") val localized_name: String,
    @SerializedName("name") val name: String,
    @SerializedName("year") val year: Int,
    @SerializedName("rating") val rating: Double,
    @SerializedName("image_url") val image_url: String,
    @SerializedName("description") val description: String,
    @SerializedName("genres") val genres: List<String>
)