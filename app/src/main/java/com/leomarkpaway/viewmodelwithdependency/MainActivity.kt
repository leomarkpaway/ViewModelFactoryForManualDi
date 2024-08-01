package com.leomarkpaway.viewmodelwithdependency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore

class MainActivity : AppCompatActivity() {
    private val viewModelFactory = createFactory { MainViewModel(Repository())}
    private val viewModel: MainViewModel = ViewModelProvider(ViewModelStore(), viewModelFactory)[MainViewModel::class.java]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO Use the viewModel globally on activity
        viewModel

    }
}