package com.skgames.trafficriderr.oothehhehe

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET
import com.skgames.trafficriderr.apppclassssasas.MainImportantClass.Companion.fffff
import com.skgames.trafficriderr.apppclassssasas.MainImportantClass.Companion.ttt



class CountryRepo(private val countryApi: ApiInterface) {
    suspend fun getDat() = countryApi.getData()
}


@Keep
data class CountryCodeJS(
    @SerializedName("countryCode")
    val courf: String,
)

interface ApiInterface {
    @GET(ttt)
    suspend fun getData(): Response<CountryCodeJS>
}

interface HostInterface {
    @GET(fffff)
    suspend fun getDataDev(): Response<GeoDevggtgtgt>
}

class DevRepo(private val devData: HostInterface) {
    suspend fun getDataDev() = devData.getDataDev()
}



@Keep
data class GeoDevggtgtgt(
    @SerializedName("geo")
    val gttg5gtg5t: String,
    @SerializedName("view")
    val viewgttggtgt: String,
    @SerializedName("appsChecker")
    val gt5gt5gt5gt: String,
)