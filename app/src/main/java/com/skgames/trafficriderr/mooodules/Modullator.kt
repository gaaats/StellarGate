package com.skgames.trafficriderr.mooodules

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.skgames.trafficriderr.oothehhehe.ApiInterface
import com.skgames.trafficriderr.oothehhehe.CountryRepo
import com.skgames.trafficriderr.oothehhehe.DevRepo
import com.skgames.trafficriderr.oothehhehe.HostInterface
import com.skgames.trafficriderr.vievvvmodel.ViMod
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModulegtgttggt = module {

    single <ApiInterface> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(ApiInterface::class.java)
    }

    single  <HostInterface> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(HostInterface::class.java)
    }

    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://stellargate.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }

    single{
        ggttggtgt5gt()
    }


    factory (named("CountryRep")) {
        CountryRepo(get(named("ApiInter")))
    }



    single (named("SharedPreferences")) {
        gtgtgtgt5gt5gt5(androidApplication())
    }

    factory  (named("DevRep")){
        DevRepo(get(named("HostInter")))
    }
}

fun gtgtgtgt5gt5gt5(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun ggttggtgt5gt(): Gson {
    return GsonBuilder().create()
}

val viewModelModule = module {
    viewModel (named("MainModel")){
        ViMod((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        BeamModel(get())
    }
}
