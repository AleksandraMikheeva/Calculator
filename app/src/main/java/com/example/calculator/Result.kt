package com.example.calculator

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContract

class Result : ActivityResultContract<Int, String?>() {
    override fun createIntent(context: Context, input: Int?): Intent {
        Toast.makeText(context, "Open settings", Toast.LENGTH_LONG).show()
        val intent = Intent(context, SettingsActivity::class.java)
        intent.putExtra(SettingsActivity.SETTINGS_RESULT_KEY, 10)
        return intent;
    }

    override fun parseResult(resultCode: Int, intent: Intent?): String? {
        return intent?.getStringExtra(SettingsActivity.SETTINGS_RESULT_KEY)

    }

}