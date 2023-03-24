package com.example.nycschoolapp.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class SchoolInfo(
    @SerializedName("dbn") val schoolId: String,
    @SerializedName("school_name") val schoolName: String,
    @SerializedName("neighborhood") val neighborhood: String? = null
) : Parcelable
