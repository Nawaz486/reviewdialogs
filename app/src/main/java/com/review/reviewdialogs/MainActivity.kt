package com.review.reviewdialogs

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.app.toolslibrary.NetworkHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(
            this,
            "${NetworkHelper.getTranslation("ar", "Hello Brother")}",
            Toast.LENGTH_SHORT
        ).show()

    }
}