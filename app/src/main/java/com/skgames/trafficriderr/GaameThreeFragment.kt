package com.skgames.trafficriderr

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.skgames.trafficriderr.databinding.FragmentGaameThreeBinding
import kotlinx.coroutines.delay


class GaameThreeFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            lifecycleScope.launchWhenCreated {
                Toast.makeText(requireContext(), "Level done!Loading Next!", Toast.LENGTH_SHORT).show()
                delay(3000)
                findNavController().navigate(R.id.action_gaameThreeFragment_to_gameTviiFragment)
            }



        } catch (e: Exception) {
            frkkfkorfkfrkorf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private var fragmentGaameThreeBinding: FragmentGaameThreeBinding? = null
    private val binding
        get() = fragmentGaameThreeBinding ?: throw RuntimeException("FragmentGameTviiBinding = null")

    private fun frkkfkorfkfrkorf() {
        jtgigtjgtjtgjgtjjgtjigt()
    }

    private fun jtgigtjgtjtgjgtjjgtjigt() {
        Toast.makeText(requireContext(), "Some error", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaameThreeBinding = FragmentGaameThreeBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentGaameThreeBinding = null
        super.onDestroy()
    }

}