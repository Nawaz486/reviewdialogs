package com.review.reviewdialogs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.review.reviewdialog.ReviewDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ReviewDialog.showRateusDialog(
            this,
            ContextCompat.getColor(this, R.color.pink),
            ArrayList(
                arrayListOf(
                    getDrawable(com.review.reviewdialog.R.drawable.ic_profile1),
                    getDrawable(com.review.reviewdialog.R.drawable.ic_profile1),
                    getDrawable(com.review.reviewdialog.R.drawable.ic_profile1)
                )
            ),
            ArrayList(
                arrayListOf(
                    "Excellent app to troubleshoot wireless networking issues.",
                    "Excellent app to troubleshoot wireless networking issues.",
                    "Excellent app to troubleshoot wireless networking issues."
                )
            ),
            ArrayList(arrayListOf("Jaculine Frenandez", "Aslam Khan", "Shangrila"))
        ) {

        }


    }
}