package dev.yasan.helper.library

import android.view.View
import com.google.android.material.snackbar.Snackbar

object ViewHelper {

    fun showSnackBar(parent: View, message: String) =
        Snackbar.make(parent, message, Snackbar.LENGTH_SHORT).show()

}


fun View.showSnackBar(message: String) =
    ViewHelper.showSnackBar(this, message)

fun String.showSnackBar(parent: View) =
    ViewHelper.showSnackBar(parent, this)