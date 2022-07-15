package com.jakmos.hiltguide.presentation.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.jakmos.hiltguide.presentation.R
import com.jakmos.hiltguide.presentation.databinding.FragmentSecondBinding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.android.scopes.ServiceScoped
import javax.inject.Inject

@ServiceScoped
class ServiceUtils @Inject constructor()

@FragmentScoped
class FragmentUtils @Inject constructor()

@ActivityScoped
class ActivityUtils @Inject constructor()

@AndroidEntryPoint
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = requireNotNull(_binding)

    private val viewModel: SecondViewModel by viewModels()

    // This is forbidden: (service scope has nothing to do with fragment)
//    @Inject
//    lateinit var serviceUtils: ServiceUtils

    @Inject
    lateinit var fragmentUtils: FragmentUtils

    @Inject
    lateinit var activityUtils: ActivityUtils

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnClicks()

        viewModel.loadUser()
    }

    private fun setOnClicks() = with(binding) {
        nextButton.setOnClickListener { findNavController().navigate(R.id.navigateToFirstFragment) }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
