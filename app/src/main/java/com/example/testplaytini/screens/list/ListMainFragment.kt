package com.example.testplaytini.screens.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.testplaytini.R
import com.example.testplaytini.databinding.FragmentListMainBinding

class ListMainFragment : Fragment() {

    private lateinit var binding: FragmentListMainBinding
    private lateinit var planeAdapter: ItemPlaneAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        planeAdapter = ItemPlaneAdapter()
        planeAdapter.callbackOnItemClick = {
            val action = ListMainFragmentDirections.actionListMainFragmentToDetailsFragment(it)
            findNavController().navigate(action)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding.rvListMain) {
            layoutManager = GridLayoutManager(requireContext(), 2)
            adapter = planeAdapter
        }
    }
}