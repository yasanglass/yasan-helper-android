package dev.yasan.helper.library

import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import com.google.android.material.snackbar.Snackbar

object ViewHelper {

    fun showSnackBar(parent: View, message: String) =
        Snackbar.make(parent, message, Snackbar.LENGTH_SHORT).show()

    fun showSnackBarOnTop(parent: View, message: String) {
        val snack: Snackbar = Snackbar.make(parent, message, Snackbar.LENGTH_LONG)
        val view = snack.view
        val params = view.layoutParams as FrameLayout.LayoutParams
        params.gravity = Gravity.TOP
        view.layoutParams = params
        snack.show()
    }

    fun visible(view: View) { view.visibility = View.VISIBLE }
    fun invisible(view: View) { view.visibility = View.INVISIBLE }
    fun gone(view: View) { view.visibility = View.GONE }

}

fun View.showSnackBar(message: String) =
    ViewHelper.showSnackBar(this, message)

fun String.showSnackBar(parent: View) =
    ViewHelper.showSnackBar(parent, this)

fun View.showSnackBarOnTop(message: String) =
    ViewHelper.showSnackBarOnTop(this, message)

fun String.showSnackBarOnTop(parent: View) =
    ViewHelper.showSnackBarOnTop(parent, this)

fun View.visible() = ViewHelper.visible(this)
fun View.invisible() = ViewHelper.invisible(this)
fun View.gone() = ViewHelper.gone(this)