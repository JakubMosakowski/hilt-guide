package com.jakmos.hiltguide.presentation.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.jakmos.hiltguide.presentation.databinding.FragmentFirstBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = requireNotNull(_binding)
    private val viewModel: FirstViewModel by viewModels()

    @Inject
    lateinit var router: FirstRouter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setOnClicks()
        viewModel.init()
    }

    private fun setOnClicks() = with(binding) {
        next.setOnClickListener { viewModel.onNextClicked(router) }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
