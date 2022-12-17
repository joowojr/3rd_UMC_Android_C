package com.example.week9_1

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RegionMnySTService {
    @GET("RegionMnyFacltStus")
    fun getStoreList(
        @Query("key") key: String,
        @Query("Type") type: String,
        @Query("pIndex") pIndex: Int,
        @Query("pSize") pSize: Int
    ): Call<RegionMnySTResponseDTO>
}