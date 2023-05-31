package com.example.testplaytini.screens.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.testplaytini.databinding.FragmentDetailsBinding
import com.example.testplaytini.utils.setImage

class DetailsFragment : Fragment() {
    private lateinit var binding: FragmentDetailsBinding

    private val args by navArgs<DetailsFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            tvTitle.text = args.item.title
            ivImage.setImage(args.item.image)
            tvImageDescription.text = args.item.imageDescription
            tvDescription.text = args.item.description
            ivBack.setOnClickListener { findNavController().popBackStack() }
        }
    }
}