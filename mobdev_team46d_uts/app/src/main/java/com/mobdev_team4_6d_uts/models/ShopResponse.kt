package com.mobdev_team4_6d_uts.models

import com.google.gson.annotations.SerializedName

data class ShopResponse(
    @SerializedName("message") val message : String,
    @SerializedName("status") val status : Boolean,
    @SerializedName("data") val data : Shop?
)