package com.devhyeon.lotto

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.devhyeon.lotto.API.LottoAPI
import com.devhyeon.lotto.data.LottoWinningInfo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    val BASE_URL_LOTTO_API = "https://www.dhlottery.co.kr"
    val GET_LOTTO_METHOD = "getLottoNumber"
    var drawNo = 900

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL_LOTTO_API)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val api = retrofit.create(LottoAPI::class.java)
        val callGetLotto = api.getLottoInfo(GET_LOTTO_METHOD, drawNo)

        callGetLotto.enqueue(object : Callback<LottoWinningInfo> {
            @SuppressLint("SetTextI18n")
            override fun onResponse(
                call: Call<LottoWinningInfo>,
                response: Response<LottoWinningInfo>
            ) {
                findViewById<TextView>(R.id.textView).text = "SUCCESS : ${response.body()}"
            }

            @SuppressLint("SetTextI18n")
            override fun onFailure(call: Call<LottoWinningInfo>, t: Throwable) {
                findViewById<TextView>(R.id.textView).text = "FAIL : $t"
            }
        })
    }
}