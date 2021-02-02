package dev.yasan.helper.library

import android.content.Context
import android.content.Intent

/**
 * A helper class with a set of functions that help with navigation related difficulties in Android applications.
 * @author Yasan Ghafariyan
 */
object NavigationHelper {

    /**
     * Starts the intent and clears the history
     * @param intent the intent you want to start
     */
    fun startIntentAndClearHistory(context: Context, intent: Intent) {
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        context.startActivity(intent)
    }

}

/**
 * Starts the intent and clears the history
 * @param intent the intent you want to start
 */
fun Context.startIntentAndClearHistory(intent: Intent) =
    NavigationHelper.startIntentAndClearHistory(this, intent)