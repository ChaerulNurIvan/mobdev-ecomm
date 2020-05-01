package com.mobdev_team4_6d_uts.models

import com.google.gson.annotations.SerializedName

data class Shop(
    @SerializedName("name") val name : String,
    @SerializedName("address") val address : String,
    @SerializedName("description") val desription : String
)