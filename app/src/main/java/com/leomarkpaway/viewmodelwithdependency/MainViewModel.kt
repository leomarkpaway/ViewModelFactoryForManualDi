package com.leomarkpaway.viewmodelwithdependency

import androidx.lifecycle.ViewModel

class MainViewModel(private val repository: Repository) : ViewModel() {}