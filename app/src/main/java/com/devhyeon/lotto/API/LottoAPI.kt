package com.devhyeon.lotto.API

import com.devhyeon.lotto.data.LottoWinningInfo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface LottoAPI {
    @GET("/common.do?")
    fun getLottoInfo(
        @Query("method") getLottoNumber: String? = null,
        @Query("drwNo") drwNo: Int? = null
    ): Call<LottoWinningInfo>
}