package dev.yasan.helper.library

import android.content.Context
import android.widget.Toast

object AppHelper {

    fun isInteger(str: String?) = str?.toIntOrNull()?.let { true } ?: false

    fun isFloat(str: String?) = str?.toFloatOrNull()?.let { true } ?: false

    // Toast

    fun toast(context: Context, message: String, lengthLong: Boolean = false) {
        val length = if (lengthLong) Toast.LENGTH_LONG else Toast.LENGTH_SHORT
        Toast.makeText(context, message, length).show()
    }

}

fun String.isInteger() = AppHelper.isInteger(this)

fun String.isFloat() = AppHelper.isFloat(this)

// Toast

fun Context.toast(message: Any): String {
    val messageString = message.toString()
    AppHelper.toast(this, messageString)
    return messageString
}

fun Context.toastLong(message: Any): String {
    val messageString = message.toString()
    AppHelper.toast(this, messageString, true)
    return messageString
}

fun Context.toast(message: String): String {
    AppHelper.toast(this, message)
    return message
}

fun Context.toastLong(message: String): String {
    AppHelper.toast(this, message, true)
    return message
}

fun String.toast(context: Context): String {
    AppHelper.toast(context, this)
    return this
}

fun String.toastLong(context: Context): String {
    AppHelper.toast(context, this, true)
    return this
}
