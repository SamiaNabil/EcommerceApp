package com.example.example

import com.google.gson.annotations.SerializedName


data class RegisterResponse(

    @SerializedName("status"  ) var status: Boolean? = null,
    @SerializedName("message" ) var message: String?  = null,
    @SerializedName("data"    ) var data: DataX ?= DataX()

)