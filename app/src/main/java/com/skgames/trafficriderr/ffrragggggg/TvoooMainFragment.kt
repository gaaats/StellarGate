package com.skgames.trafficriderr.ffrragggggg

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.skgames.trafficriderr.R
import com.skgames.trafficriderr.vievvvmodel.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class TvoooMainFragment : Fragment() {
    val gt4g48t4484gt by activityViewModel<ViMod>(named("MainModel"))
    lateinit var g5gt5gt5gtgt5tg: String
    lateinit var f5rf5rf5fr: String

    private fun jgtjtgjgtjgtgtj() {
        sdcvfrfrfdd()
    }

    private fun sdcvfrfrfdd() {
        frfjrfijfrjrf()
    }

    private fun frfjrfijfrjrf() {
        findNavController().navigate(R.id.action_tvoooMainFragment_to_preeefilterFragment)
    }

    lateinit var appssefr5rfrf: String
    private lateinit var fr5rf5fr5: Context

    val g5gt5gtgtgt5: SharedPreferences by inject(named("SharedPreferences"))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tvooo_main, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        fr5rf5fr5 = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rfijgithgthgthugthuuhuugt()

        gt4g48t4484gt.gttg4h4hy4hy44hy.observe(viewLifecycleOwner) {
            if (it != null) {

                g5gt5gt5gtgt5tg = it.gttg5gtg5t
                appssefr5rfrf = it.gt5gt5gt5gt
                f5rf5rf5fr = it.viewgttggtgt

                g5gt5gtgtgt5.edit().putString("countryDev", g5gt5gt5gtgt5tg).apply()
                g5gt5gtgtgt5.edit().putString("apps", appssefr5rfrf).apply()
                g5gt5gtgtgt5.edit().putString("wv", f5rf5rf5fr).apply()

                jgtjtgjgtjgtgtj()
            }
        }
    }

    private fun rfijgithgthgthugthuuhuugt() {
        gt4g48t4484gt.gt5gtgt5gtgt5gt5.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                g5gt5gtgtgt5.edit().putString("mainId", main).apply()
            }
        }
    }


}