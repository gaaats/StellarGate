package com.skgames.trafficriderr.ffrragggggg

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.skgames.trafficriderr.R
import com.skgames.trafficriderr.vievvvmodel.ViMod
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class MainOneeeFragment : Fragment() {
    private fun rfjrfjfrjijrfrfji() {
        rffrrfirf()
    }

    private fun rffrrfirf() {
        findNavController().navigate(R.id.action_mainOneeeFragment_to_cooontryryryFragment)
    }

    val gttggtgtgtgt by activityViewModel<ViMod>(named("MainModel"))

    private lateinit var mContextgtgtgtgt: Context

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_oneee, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContextgtgtgtgt=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fgtjgtjijgtjigtjigtjigt()

        frgtjjtgjtgjigtjgtjijigt()

    }

    private fun fgtjgtjijgtjigtjigtjigt() {
        gttggtgtgtgt.g5gt5gthy44hy4hy4hy(mContextgtgtgtgt)
    }

    private fun frgtjjtgjtgjigtjgtjijigt() {
        rfjrfjfrjijrfrfji()
    }


}