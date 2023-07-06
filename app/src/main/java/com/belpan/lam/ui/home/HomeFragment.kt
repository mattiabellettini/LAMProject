package com.belpan.lam.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.belpan.lam.databinding.FragmentHomeBinding
import kotlin.random.Random
import kotlin.random.nextInt

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val names = listOf("Mattia C", "Mattia B", "Alessio", "Jack")
    private val agg = listOf("Coglione", "Babbeo", "Mongolo", "Campione", "Fustini")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle? //Inutile
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java) //TODO

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.fab.setOnClickListener {
            binding.fab.visibility = View.GONE
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}