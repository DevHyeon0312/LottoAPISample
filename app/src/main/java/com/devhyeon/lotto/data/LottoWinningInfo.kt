package com.devhyeon.lotto.data

/**
    "totSellamnt":81032551000,
    "returnValue":"success",
    "drwNoDate":"2019-06-01",
    "firstWinamnt":4872108844,
    "drwtNo6":25,
    "drwtNo4":21,
    "firstPrzwnerCo":4,
    "drwtNo5":22,
    "bnusNo":24,
    "firstAccumamnt":19488435376,
    "drwNo":861,
    "drwtNo2":17,
    "drwtNo3":19,
    "drwtNo1":11
 * */
data class LottoWinningInfo (
    var totSellamnt : Long = 0,
    var returnValue : String = "",
    var drwNoDate : String = "",
    var firstWinamnt : Long = 0,
    var firstAccumamnt : Long = 0,
    var firstPrzwnerCo : Int = 0,
    var drwNo : Long = 0,
    var drwtNo1 : Int = 0,
    var drwtNo2 : Int = 0,
    var drwtNo3 : Int = 0,
    var drwtNo4 : Int = 0,
    var drwtNo5 : Int = 0,
    var drwtNo6 : Int = 0,
    var bnusNo : Int = 0
)