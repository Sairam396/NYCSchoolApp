package com.example.nycschoolapp.data.api

import com.example.nycschoolapp.data.model.SatInfo
import com.example.nycschoolapp.data.model.SchoolInfo
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    // Get School List
    @GET(SCHOOLS)
    suspend fun getSchoolInfo(): List<SchoolInfo>

    // Get Sat Scores
    @GET(SATSCORE_ENDPOINT)
    suspend fun getSatScores(@Query("dbn") schoolId: String): List<SatInfo>

    companion object {
        const val BASE_URL = "https://data.cityofnewyork.us/resource/"
        const val SCHOOLS = "s3k6-pzi2.json"
        const val SATSCORE_ENDPOINT = "f9bf-2cp4.json"
    }
}