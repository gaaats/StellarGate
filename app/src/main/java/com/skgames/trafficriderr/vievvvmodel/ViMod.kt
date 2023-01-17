package com.skgames.trafficriderr.vievvvmodel


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AFInAppEventParameterName
import com.appsflyer.AppsFlyerConversionListener
import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.skgames.trafficriderr.oothehhehe.CountryRepo
import com.skgames.trafficriderr.oothehhehe.DevRepo
import com.skgames.trafficriderr.oothehhehe.GeoDevggtgtgt
import io.branch.referral.util.BRANCH_STANDARD_EVENT
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.google.firebase.analytics.FirebaseAnalytics
import com.skgames.trafficriderr.oothehhehe.CountryCodeJS
import io.branch.referral.util.BranchEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ViMod(
    private val ggtgt5gt5: CountryRepo,
    private val gt5gt5gt5gt: DevRepo,
    private val gtgtugtiighvvfbfvvfhb: SharedPreferences,
    val fr5gt44hy4h4hyhy: Application
) : ViewModel() {

    init {
        rijrfjfrjrfjrfjrfrf()
    }

    private fun rijrfjfrjrfjrfjrfrf() {
        viewModelScope.launch(Dispatchers.IO) {
            gt59tg5hy4hy48hy4hy()
        }
        viewModelScope.launch(Dispatchers.Main) {
            gttggtgtgtgttg()
        }
    }


    private val gtgtgtgtgt = MutableLiveData<CountryCodeJS>()
    val hyjujvvfrffrrf: LiveData<CountryCodeJS>
        get() = gtgtgtgtgt

    suspend fun gttggtgtgtgttg() {
        yhyjukiikik95ik5ki.postValue(ggtgt5gt5.getDat().body())
        Log.d("lolo", "_countryCode is ${yhyjukiikik95ik5ki.value}")
        gt5tg5gt5gt5gtgt5gt5gt()
    }

    suspend fun gt5tg5gt5gt5gtgt5gt5gt() {
        Log.d("lolo", "_geo is ${gt5gt5gt5hy4yh44hy.value}")
        gt5gt5gt5hy4yh44hy.postValue(gt5gt5gt5gt.getDataDev().body())
    }

    fun gtgtg5tt4hy48hy4h4y(gtgt5gtgt5gt: Context) {
        AppsFlyerLib.getInstance()
            .init("dY5hPjCYwqCtbMM64gSbaS", g4gt4gt44hy4hy4hy4v1f15rfdff, fr5gt44hy4h4hyhy)
        AppsFlyerLib.getInstance().start(gtgt5gtgt5gt)
    }

    fun g5gt5gthy44hy4hy4hy(cont: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            cont
        ) { data: AppLinkData? ->
            data?.let {
                val gt5tg5tg5gt5hy4hy4hy4hy4hyhy = data.targetUri?.host.toString()
                gtgtugtiighvvfbfvvfhb.edit().putString("deepSt", gt5tg5tg5gt5hy4hy4hy4hy4hyhy).apply()
            }
        }
    }





    fun gt59tg5hy4hy48hy4hy() {
        val gthy44yh4hy4hy4 = AdvertisingIdClient(fr5gt44hy4h4hyhy)
        gthy44yh4hy4hy4.start()
        val gth44hyhyjuuj4ju44uj = gthy44yh4hy4hy4.info.id.toString()
        g5gttg4gt44gt4gt4gt4.postValue(gth44hyhyjuuj4ju44uj)
    }



    private val g4gt4gt44hy4hy4hy4v1f15rfdff = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val frrf5f55fr5rf = data?.get("campaign").toString()
            gt5tghyyh4ju4h55h.postValue(frrf5f55fr5rf)

            val frrfgt4gtvnjkfnkfrkjrf = Bundle()
            val gt4gt4hy44hy4hybhy4hy = FirebaseAnalytics.getInstance(fr5gt44hy4h4hyhy.applicationContext)
            var g5tg5gt5gt5gt5gt = "opened_firstly"
            when (data?.get(AFInAppEventParameterName.AF_CHANNEL).toString()) {
                "ACI_Search" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.ACHIEVE_LEVEL).setDescription("ACI_Search")
                        .logEvent(fr5gt44hy4h4hyhy.applicationContext)
                    g5tg5gt5gt5gt5gt = "first_open_s"
                    gt4gt4hy44hy4hybhy4hy.logEvent(g5tg5gt5gt5gt5gt, frrfgt4gtvnjkfnkfrkjrf)


                }
                "ACI_Youtube" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.SHARE).setDescription("ACI_Youtube")
                        .logEvent(fr5gt44hy4h4hyhy.applicationContext)
                    g5tg5gt5gt5gt5gt = "first_open_y"
                    gt4gt4hy44hy4hybhy4hy.logEvent(g5tg5gt5gt5gt5gt, frrfgt4gtvnjkfnkfrkjrf)


                }
                "ACI_Display" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.RATE).setDescription("ACI_Display")
                        .logEvent(fr5gt44hy4h4hyhy.applicationContext)
                    g5tg5gt5gt5gt5gt = "first_open_d"
                    gt4gt4hy44hy4hybhy4hy.logEvent(g5tg5gt5gt5gt5gt, frrfgt4gtvnjkfnkfrkjrf)

                }

                else -> {


                    BranchEvent(BRANCH_STANDARD_EVENT.VIEW_AD).setDescription("NoChannel")
                        .logEvent(fr5gt44hy4h4hyhy.applicationContext)
                    Log.d("Branch Check", "I'm here, branch bitch! No source though")
                }

            }

            gt4gt4hy44hy4hybhy4hy.logEvent(g5tg5gt5gt5gt5gt, frrfgt4gtvnjkfnkfrkjrf)
        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(error: String?) {
        }
    }

    private val yhyjukiikik95ik5ki = MutableLiveData<CountryCodeJS>()
    val g5hy5yh5yh5hy: LiveData<CountryCodeJS>
        get() = yhyjukiikik95ik5ki


    private val gt5gt5gt5gt5tg5gt = MutableLiveData<String>()
    val gbgmnbnntgkjtgjjgtjgtgt5: LiveData<String>
        get() = gt5gt5gt5gt5tg5gt

    private val gt5gt5gt5hy4yh44hy = MutableLiveData<GeoDevggtgtgt>()
    val gttg4h4hy4hy44hy: LiveData<GeoDevggtgtgt>
        get() = gt5gt5gt5hy4yh44hy


    private val gt5tghyyh4ju4h55h = MutableLiveData<String>()
    val g5gt5gt55gt5gt5: LiveData<String>
        get() = gt5tghyyh4ju4h55h



    private val g5gttg4gt44gt4gt4gt4 = MutableLiveData<String?>()
    val gt5gtgt5gtgt5gt5: LiveData<String?>
        get() = g5gttg4gt44gt4gt4gt4





}