package com.example.nycschoolapp.data.model

import com.google.gson.annotations.SerializedName

data class SatInfo(
    @SerializedName("dbn") val schoolId: String,
    @SerializedName("school_name") val schoolName: String? = null,
    @SerializedName("num_of_sat_test_takers") val numTestTakers: String? = null,
    @SerializedName("sat_critical_reading_avg_score") val readingScore: String? = null,
    @SerializedName("sat_math_avg_score") val mathScore: String? = null,
    @SerializedName("sat_writing_avg_score") val writingScore: String? = null
)