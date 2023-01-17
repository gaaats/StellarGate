package com.skgames.trafficriderr

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.skgames.trafficriderr.databinding.FragmentGameTviiBinding
import kotlinx.coroutines.delay
import kotlin.random.Random


class GameTviiFragment : Fragment() {

    private val listBind by lazy {
        listOf(
            binding.el1111,
            binding.el2222,
            binding.el3333,
            binding.el4444,
            binding.el5555,
            binding.el6666,
            binding.el77777,
            binding.el88888,
        )
    }

    private fun check(): Boolean {
        listBind.forEach {
            if (it.visibility == View.VISIBLE) return false
        }
        return true
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {


            binding.el1111.setOnClickListener {
                lifecycleScope.launchWhenCreated {
                    listBind.forEach {
                        it.isEnabled = false
                    }
                    val num = Random.nextInt(from = 100, until = 500)

                    Toast.makeText(requireContext(), "Earn ${num}", Toast.LENGTH_SHORT).show()
                    it.visibility = View.INVISIBLE

                    delay(2000)

                    if (check()) {
                        findNavController().navigate(R.id.action_gameTviiFragment_to_gaameThreeFragment)
                    }

                    listBind.forEach {
                        it.isEnabled = true
                    }
                }
            }
            binding.el2222.setOnClickListener {
                lifecycleScope.launchWhenCreated {
                    listBind.forEach {
                        it.isEnabled = false
                    }
                    val num = Random.nextInt(from = 100, until = 500)

                    Toast.makeText(requireContext(), "Earn ${num}", Toast.LENGTH_SHORT).show()
                    it.visibility = View.INVISIBLE

                    delay(2000)

                    if (check()) {
                        findNavController().navigate(R.id.action_gameTviiFragment_to_gaameThreeFragment)
                    }

                    listBind.forEach {
                        it.isEnabled = true
                    }
                }
            }
            binding.el3333.setOnClickListener {
                lifecycleScope.launchWhenCreated {
                    listBind.forEach {
                        it.isEnabled = false
                    }
                    val num = Random.nextInt(from = 100, until = 500)

                    Toast.makeText(requireContext(), "Earn ${num}", Toast.LENGTH_SHORT).show()
                    it.visibility = View.INVISIBLE

                    delay(2000)

                    if (check()) {
                        findNavController().navigate(R.id.action_gameTviiFragment_to_gaameThreeFragment)
                    }

                    listBind.forEach {
                        it.isEnabled = true
                    }
                }
            }
            binding.el4444.setOnClickListener {
                lifecycleScope.launchWhenCreated {
                    listBind.forEach {
                        it.isEnabled = false
                    }
                    val num = Random.nextInt(from = 100, until = 500)

                    Toast.makeText(requireContext(), "Earn ${num}", Toast.LENGTH_SHORT).show()
                    it.visibility = View.INVISIBLE

                    delay(2000)

                    if (check()) {
                        findNavController().navigate(R.id.action_gameTviiFragment_to_gaameThreeFragment)
                    }

                    listBind.forEach {
                        it.isEnabled = true
                    }
                }
            }
            binding.el5555.setOnClickListener {
                lifecycleScope.launchWhenCreated {
                    listBind.forEach {
                        it.isEnabled = false
                    }
                    val num = Random.nextInt(from = 100, until = 500)

                    Toast.makeText(requireContext(), "Earn ${num}", Toast.LENGTH_SHORT).show()
                    it.visibility = View.INVISIBLE

                    delay(2000)

                    if (check()) {
                        findNavController().navigate(R.id.action_gameTviiFragment_to_gaameThreeFragment)
                    }

                    listBind.forEach {
                        it.isEnabled = true
                    }
                }
            }
            binding.el6666.setOnClickListener {
                lifecycleScope.launchWhenCreated {
                    listBind.forEach {
                        it.isEnabled = false
                    }
                    val num = Random.nextInt(from = 100, until = 500)

                    Toast.makeText(requireContext(), "Earn ${num}", Toast.LENGTH_SHORT).show()
                    it.visibility = View.INVISIBLE

                    delay(2000)

                    if (check()) {
                        findNavController().navigate(R.id.action_gameTviiFragment_to_gaameThreeFragment)
                    }

                    listBind.forEach {
                        it.isEnabled = true
                    }
                }
            }
            binding.el77777.setOnClickListener {
                lifecycleScope.launchWhenCreated {
                    listBind.forEach {
                        it.isEnabled = false
                    }
                    val num = Random.nextInt(from = 100, until = 500)

                    Toast.makeText(requireContext(), "Earn ${num}", Toast.LENGTH_SHORT).show()
                    it.visibility = View.INVISIBLE

                    delay(2000)

                    if (check()) {
                        findNavController().navigate(R.id.action_gameTviiFragment_to_gaameThreeFragment)
                    }

                    listBind.forEach {
                        it.isEnabled = true
                    }
                }
            }
            binding.el88888.setOnClickListener {
                lifecycleScope.launchWhenCreated {
                    listBind.forEach {
                        it.isEnabled = false
                    }
                    val num = Random.nextInt(from = 100, until = 500)

                    Toast.makeText(requireContext(), "Earn ${num}", Toast.LENGTH_SHORT).show()
                    it.visibility = View.INVISIBLE

                    delay(2000)

                    if (check()) {
                        findNavController().navigate(R.id.action_gameTviiFragment_to_gaameThreeFragment)
                    }

                    listBind.forEach {
                        it.isEnabled = true
                    }
                }
            }


        } catch (e: Exception) {
            frkkfkorfkfrkorf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private var fragmentGameTviiBinding: FragmentGameTviiBinding? = null
    private val binding
        get() = fragmentGameTviiBinding ?: throw RuntimeException("FragmentGameTviiBinding = null")

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
        fragmentGameTviiBinding = FragmentGameTviiBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentGameTviiBinding = null
        super.onDestroy()
    }

}