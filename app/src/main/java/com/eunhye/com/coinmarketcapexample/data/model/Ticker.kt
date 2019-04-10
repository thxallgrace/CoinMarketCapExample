package com.eunhye.com.coinmarketcapexample.data.model

data class Ticker(
    var currency: String? = "",
    var baseCurrency: String? = "",
    var last: Double?,
    var high: Double?,
    var low: Double?,
    var volume: Double?,
    var diff: Double? = null
) : ITicker {
    override fun toTicker() = this
}