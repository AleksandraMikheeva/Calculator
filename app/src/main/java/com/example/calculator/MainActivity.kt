package com.example.calculator

import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.calculator.databinding.MainActivityBinding

class MainActivity : BaseActivity() {

    private val viewModel: MainViewModel by viewModels()
    private val viewBinding by viewBinding(MainActivityBinding::bind)

    private val getResult: ActivityResultLauncher<Int> =
        registerForActivityResult(Result()) { result ->
            Toast.makeText(this, "result $result", Toast.LENGTH_SHORT).show()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        viewBinding.mainInput.apply {
            showSoftInputOnFocus = false
        }
        viewBinding.mainActivitySettings.setOnClickListener {
            openSettings()
        }

        viewBinding.mainEquals.setOnClickListener {
            viewBinding.mainResult.text = "4"
        }
    }

    private fun openSettings() {
        getResult.launch(10)
    }
}
