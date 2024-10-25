package com.review.reviewdialog

import android.app.Activity
import android.widget.Toast

object ReviewDialog {

    fun showToast(context: Activity , message : String){
        Toast.makeText(context , message , Toast.LENGTH_SHORT).show()
    }

}