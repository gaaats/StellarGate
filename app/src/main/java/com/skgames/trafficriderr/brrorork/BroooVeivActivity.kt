package com.skgames.trafficriderr.brrorork

import android.content.Context
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.skgames.trafficriderr.apppclassssasas.MainImportantClass
import com.skgames.trafficriderr.apppclassssasas.MainImportantClass.Companion.aps_idggtgttg
import com.skgames.trafficriderr.databinding.ActivityBroooVeivBinding
import com.skgames.trafficriderr.mooodules.BeamModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore


class BroooVeivActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindBeamgtgtgt = ActivityBroooVeivBinding.inflate(layoutInflater)
        setContentView(bindBeamgtgtgt.root)
        beamgttggtgtg = bindBeamgtgtgt.veeeWebView
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(beamgttggtgtg, true)
        tggtjijgtijgtjgtt.webSethyhy5yh6h5y5hy(beamgttggtgtg)


        beamgttggtgtg.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (tggtjijgtijgtjgtt.frgt4gt5gt4gt45gt(url)) {

                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        startActivity(intent)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                saveUrl(url)
            }


            override fun onReceivedError(
                view: WebView?,
                errorCode: Int,
                description: String?,
                failingUrl: String?
            ) {
                Toast.makeText(this@BroooVeivActivity, description, Toast.LENGTH_SHORT).show()
            }
        }

        beamgttggtgtg.webChromeClient = ChromeClient()
        beamgttggtgtg.loadUrl(urururururururur())
    }

    private lateinit var bindBeamgtgtgt: ActivityBroooVeivBinding
    lateinit var beamgttggtgtg: WebView


    private var mFilePathCallbackgtgtgt: ValueCallback<Array<Uri>>? = null
    private var mCameraPhotoPathgttggtgt: String? = null
    private val gtgtgtgtgt = 1

    private val tggtjijgtijgtjgtt by viewModel<BeamModel>(
        named("BeamModel")
    )

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != gtgtgtgtgt || mFilePathCallbackgtgtgt == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var results: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (mCameraPhotoPathgttggtgt != null) {
                    results = arrayOf(Uri.parse(mCameraPhotoPathgttggtgt))
                }
            } else {
                val gtjgtjijgtgtjigtji = data.dataString
                if (gtjgtjijgtgtjigtji != null) {
                    results = arrayOf(Uri.parse(gtjgtjijgtgtjigtji))
                }
            }
        }
        mFilePathCallbackgtgtgt!!.onReceiveValue(results)
        mFilePathCallbackgtgtgt = null
        return
    }


    inner class ChromeClient : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            filePath: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            mFilePathCallbackgtgtgt?.onReceiveValue(null)
            mFilePathCallbackgtgtgt = filePath
            var gktogtjtgijgttg: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (gktogtjtgijgttg!!.resolveActivity(packageManager) != null) {
                var gkgtktggtgtjtgi: File? = null
                try {
                    gkgtktggtgtjtgi = gtgtjgtjgtjgtijigt()
                    gktogtjtgijgttg.putExtra("PhotoPath", mCameraPhotoPathgttggtgt)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (gkgtktggtgtjtgi != null) {
                    mCameraPhotoPathgttggtgt = "file:" + gkgtktggtgtjtgi.absolutePath
                    gktogtjtgijgttg.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(gkgtktggtgtjtgi)
                    )
                } else {
                    gktogtjtgijgttg = null
                }
            }
            val selectionIntent = Intent(Intent.ACTION_GET_CONTENT)
            selectionIntent.addCategory(Intent.CATEGORY_OPENABLE)
            selectionIntent.type = "image/*"
            val value: Array<Intent?> =
                gktogtjtgijgttg?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val gtgtkgtgt = Intent(Intent.ACTION_CHOOSER)
            gtgtkgtgt.putExtra(Intent.EXTRA_INTENT, selectionIntent)
            gtgtkgtgt.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            gtgtkgtgt.putExtra(Intent.EXTRA_INITIAL_INTENTS, value)
            startActivityForResult(gtgtkgtgt, gtgtgtgtgt)
            return true
        }

        private fun gtgtjgtjgtjgtijigt(): File? {
            val gtjitggtgtgt = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val gtgthugh = "JPEG_" + gtjitggtgtgt + "_"
            val gtjtggtgtjigtji = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                gtgthugh,
                ".jpg",
                gtjtggtgtjigtji
            )
        }
    }

    private var hyuujujujuj = false
    override fun onBackPressed() {
        if (beamgttggtgtg.canGoBack()) {
            if (hyuujujujuj) {
                beamgttggtgtg.stopLoading()
                beamgttggtgtg.loadUrl(urlfififif)
            }
            this.hyuujujujuj = true
            beamgttggtgtg.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                hyuujujujuj = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    private fun urururururururur(): String {

        val spoon = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)


        val sharPre = getSharedPreferences(
            "SHARED_PREF",
            Context.MODE_PRIVATE
        )

        val link = sharPre.getString("link", null)
        val myTrId = sharPre.getString(MainImportantClass.instIdfrffrr, null)
        val afId = sharPre.getString(aps_idggtgttg, null)

        val interd = sharPre.getString("WebInt", null)


        when (interd) {
            "campaign" -> {
                tggtjijgtijgtjgtt.pushToOSgt6tg56gt6tg55gt(afId.toString())
            }
            "deepLink" -> {
                tggtjijgtijgtjgtt.pushToOSgt6tg56gt6tg55gt(afId.toString())
            }
            "deepLinkNOApps" -> {
                tggtjijgtijgtjgtt.pushToOSgt6tg56gt6tg55gt(myTrId.toString())
            }
            "geo" -> {
                tggtjijgtijgtjgtt.pushToOSgt6tg56gt6tg55gt(myTrId.toString())
            }

        }

        return spoon.getString("SAVED_URL", link).toString()
    }

    var urlfififif = ""
    fun saveUrl(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (urlfififif == "") {
                urlfififif = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val spspspspsppspspsp =
                    getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val ededededededed = spspspspsppspspsp.edit()
                ededededededed.putString("SAVED_URL", lurlurlurlurlur)
                ededededededed.apply()
            }
        }
    }


}

