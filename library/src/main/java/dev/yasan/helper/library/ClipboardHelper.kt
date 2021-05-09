package dev.yasan.helper.library

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.widget.Toast

/**
 * A helper class with a set of functions that help with clipboard related functions in Android applications.
 *
 * @author Yasan Ghafariyan
 */
object ClipboardHelper {

    /**
     * Copies the string param to the clipboard.
     *
     * @param string The string you want to copy to clipboard.
     * @param onSuccess Will be called when string is copied to clipboard successfully
     *
     * @author Yasan Ghafariyan
     */
    fun copyToClipboard(context: Context, string: String, onSuccess: () -> Unit = {}): Boolean {
        return try {
            val clipboard: ClipboardManager = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText(string, string)
            clipboard.setPrimaryClip(clip)
            onSuccess()
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

}

/**
 * Copies the string param to the clipboard.
 *
 * @param string The string you want to copy to clipboard.
 * @param onSuccess Will be called when string is copied to clipboard successfully
 *
 * @author Yasan Ghafariyan
 */
fun Context.copyToClipboard(string: String, onSuccess: () -> Unit = {}) =
    ClipboardHelper.copyToClipboard(this, string, onSuccess)

