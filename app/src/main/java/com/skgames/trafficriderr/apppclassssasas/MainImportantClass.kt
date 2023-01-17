package com.skgames.trafficriderr.apppclassssasas


import com.skgames.trafficriderr.mooodules.appModulegtgttggt
import com.skgames.trafficriderr.mooodules.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import io.branch.referral.Branch
import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal


class MainImportantClass:Application() {


    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_IDfrgtgtrtyhhy)

        tgtjgtjitjgijtgjtgjjtg()

        // Branch object initialization
        Branch.getAutoInstance(this)

        //Kochava init
//        Tracker.getInstance().startWithAppGuid(applicationContext, "kojoy-of-iridescence-w9gx2r")


        val yhyyhyhyhhy = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val settingsgtthyhyhy = getSharedPreferences("PREFS_NAME", 0)

        val trackerParamsgtgtgtgt = MyTracker.getTrackerParams()
        val trackerConfighyhyhyhyhyhy = MyTracker.getTrackerConfig()

        val instID = MyTracker.getInstanceId(this)
        trackerConfighyhyhyhyhyhy.isTrackingLaunchEnabled = true

        if (settingsgtthyhyhy.getBoolean("my_first_time", true)) {
            yhyyhyhyhhy.edit().putString(instIdfrffrr, instID).apply()
            settingsgtthyhyhy.edit().putBoolean("my_first_time", false).apply()
        } else {

        }
        gtjgtjtigjijgtjtigjgtjjtgijtgi()

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MainImportantClass)
            modules(
                listOf(
                    viewModelModule, appModulegtgttggt
                )
            )
        }
    }

    private fun gtjgtjtigjijgtjtigjgtjjtgijtgi() {
        MyTracker.initTracker("88792592140372975184", this)
    }

    private fun tgtjgtjitjgijtgjtgjjtg() {
        Branch.enableTestMode()
    }

    companion object {
        const val ONESIGNAL_APP_IDfrgtgtrtyhhy = "f1b6255c-f3fa-4886-8861-3d845e44d20f"
        var instIdfrffrr: String? = "instID"
        var aps_idggtgttg: String? = "main_id"

        const val ttt = "json/?key=KXgMIA7HSEcn0SV"
        const val fffff = "file.json"
    }
}