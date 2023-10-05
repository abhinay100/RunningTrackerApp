package com.androiddevs.runningappyt.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.androiddevs.runningappyt.R
import com.androiddevs.runningappyt.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by Abhinay on 05/10/23.
 */
@AndroidEntryPoint
class TrackingFragment: Fragment(R.layout.fragment_tracking) {
    //Dagger hilt will setup viewmodel factory by default by using viewmodels
    private val viewModel: MainViewModel by viewModels()
}