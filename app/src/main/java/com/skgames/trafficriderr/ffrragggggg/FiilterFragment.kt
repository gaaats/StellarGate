package com.skgames.trafficriderr.ffrragggggg


import com.skgames.trafficriderr.R
import com.skgames.trafficriderr.apppclassssasas.MainImportantClass
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.appsflyer.AppsFlyerLib
import com.my.tracker.MyTracker
import com.skgames.trafficriderr.apppclassssasas.MainImportantClass.Companion.aps_idggtgttg
import com.skgames.trafficriderr.brrorork.BroooVeivActivity
import com.skgames.trafficriderr.gggaaamememe.FunAccccActivity
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FiilterFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fiilter, container, false)
    }

    private lateinit var mContextggt2gtgt: Context
    val sharePgt62t: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContextggt2gtgt = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val one = "deviceID="
        val subOne = "sub_id_1="
        val ad_id = "ad_id="
        val subFour = "sub_id_4="
        val subFive = "sub_id_5="
        val subSix = "sub_id_6="
        val namm = "naming"
        val trololo = "deeporg"

        val countfrrfrfrf = sharePgt62t.getString("country", null)
        val countryDevgtgtgtgt = sharePgt62t.getString("countryDev", null)
        val appsgtgtgt = sharePgt62t.getString("apps", null)
        val wvgttggt = sharePgt62t.getString("wv", null)
        val appCampgtgttggt = sharePgt62t.getString("appCamp", null)
        val deepStggtgtgt = sharePgt62t.getString("deepSt", null)
        val mainIdgtgttggt = sharePgt62t.getString("mainId", null)
        val packgtgt5gt5tg = "com.skgames.trafficriderr"
        val buildVersgtgtgtgt55 = Build.VERSION.RELEASE
        val gtgtgtgtgtgt5rId = sharePgt62t.getString(MainImportantClass.instIdfrffrr, null)
        val trackerParamsggt5gtgt5gt5 = MyTracker.getTrackerParams()
        trackerParamsggt5gtgt5gt5.setCustomUserId(gtgtgtgtgtgt5rId)

        val intentGameaaaaaaaa = Intent(activity, FunAccccActivity::class.java)
        val intentBeamrffrfrrfrfrf = Intent(activity, BroooVeivActivity::class.java)


        val gt5gt5tggt5gt = AppsFlyerLib.getInstance().getAppsFlyerUID(mContextggt2gtgt)
        rfijrfijrfjrfjirfifrjfrj()

        sharePgt62t.edit().putString(aps_idggtgttg, gt5gt5tggt5gt).apply()

        val linkFBNullAppsf565gt5tg = "$wvgttggt$subOne$deepStggtgtgt&$one$gtgtgtgtgtgt5rId&$ad_id$gtgtgtgtgtgt5rId&$subFour$packgtgt5gt5tg&$subFive$buildVersgtgtgtgt55&$subSix$trololo"

        val linkAppssssde5ded5 = "$wvgttggt$subOne$appCampgtgttggt&$one$gt5gt5tggt5gt&$ad_id$mainIdgtgttggt&$subFour$packgtgt5gt5tg&$subFive$buildVersgtgtgtgt55&$subSix$namm"
        val linkMTgtgtgtgt = "$wvgttggt$one$gtgtgtgtgtgt5rId&$ad_id$gtgtgtgtgtgt5rId&$subFour$packgtgt5gt5tg&$subFive$buildVersgtgtgtgt55&$subSix$namm"
        val gtgtgtgtgtgtgtgt = "$wvgttggt$subOne$deepStggtgtgt&$one$gt5gt5tggt5gt&$ad_id$mainIdgtgttggt&$subFour$packgtgt5gt5tg&$subFive$buildVersgtgtgtgt55&$subSix$trololo"

        when(appsgtgtgt) {
            "1" ->
                if(appCampgtgttggt!!.contains("tdb2")) {
                    Log.d("lolo", "link is $linkAppssssde5ded5")
                    sharePgt62t.edit().putString("link", linkAppssssde5ded5).apply()
                    sharePgt62t.edit().putString("WebInt", "campaign").apply()
                    gjigtgthghuthugthgthgthugt(intentBeamrffrfrrfrfrf)
                    gtkgtoktgkgtkkgtkogt()
                } else if (deepStggtgtgt!=null||countryDevgtgtgtgt!!.contains(countfrrfrfrf.toString())) {

                    Log.d("lolo", "link is $gtgtgtgtgtgtgtgt")
                    Log.d("lolo", "countryDev is $countryDevgtgtgtgt")
                    Log.d("lolo", "count is $countfrrfrfrf")
                    sharePgt62t.edit().putString("link", gtgtgtgtgtgtgtgt).apply()
                    sharePgt62t.edit().putString("WebInt", "deepLink").apply()
                    gjigtgthghuthugthgthgthugt(intentBeamrffrfrrfrfrf)
                    gtkgtoktgkgtkkgtkogt()
                } else {
                    gjigtgthghuthugthgthgthugt(intentGameaaaaaaaa)
                    gtkgtoktgkgtkkgtkogt()
                }
            "0" ->
                if(deepStggtgtgt!=null) {
                    sharePgt62t.edit().putString("link", linkFBNullAppsf565gt5tg).apply()
                    sharePgt62t.edit().putString("WebInt", "deepLinkNOApps").apply()
                    gjigtgthghuthugthgthgthugt(intentBeamrffrfrrfrfrf)
                    gtkgtoktgkgtkkgtkogt()
                } else if (countryDevgtgtgtgt!!.contains(countfrrfrfrf.toString())) {
                    Log.d("WebTesting", linkMTgtgtgtgt)
                    sharePgt62t.edit().putString("link", linkMTgtgtgtgt).apply()
                    sharePgt62t.edit().putString("WebInt", "geo").apply()
                    gjigtgthghuthugthgthgthugt(intentBeamrffrfrrfrfrf)
                    gtkgtoktgkgtkkgtkogt()
                } else {
                    gjigtgthghuthugthgthgthugt(intentGameaaaaaaaa)
                    gtkgtoktgkgtkkgtkogt()
                }
        }
    }

    private fun gtkgtoktgkgtkkgtkogt() {
        activity?.finish()
    }

    private fun gjigtgthghuthugthgthgthugt(intentBeamrffrfrrfrfrf: Intent) {
        startActivity(intentBeamrffrfrrfrfrf)
    }

    private fun rfijrfijrfjrfjirfifrjfrj() {
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
    }
}