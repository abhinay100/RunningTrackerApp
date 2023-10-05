package com.androiddevs.runningappyt.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.androiddevs.runningappyt.repositories.MainRepository

/**
 * Created by Abhinay on 05/10/23.
 */
class StatisticsViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
): ViewModel()  {

}