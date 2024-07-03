package com.leomarkpaway.viewmodelwithdependency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()
        val factory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(viewModelStore, factory)[MainViewModel::class.java]

    }
}