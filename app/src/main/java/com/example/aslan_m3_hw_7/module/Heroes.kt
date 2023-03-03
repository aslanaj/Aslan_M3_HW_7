package com.example.aslan_m3_hw_7.module

import android.media.Image
import android.media.ImageReader
import android.os.Parcel
import android.os.Parcelable

data class Heroes (

    val heroesStatus: String? = "",
    val heroesName: String? = "",
    val heroesImage: String? = ""


): java.io.Serializable