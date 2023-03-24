package com.example.nycschoolapp

import com.example.nycschoolapp.data.api.ApiService
import com.example.nycschoolapp.data.model.SatInfo
import com.example.nycschoolapp.data.model.SchoolInfo
import javax.inject.Inject

class SchoolUsecase @Inject constructor(
    private val apiService: ApiService
) : ApiService {

    override suspend fun getSchoolInfo(): List<SchoolInfo> {
        return apiService.getSchoolInfo()
            .sortedWith(compareBy(String.CASE_INSENSITIVE_ORDER){ it.schoolName })
    }

    override suspend fun getSatScores(schoolId: String): List<SatInfo> {
        return apiService.getSatScores(schoolId)
    }
}

