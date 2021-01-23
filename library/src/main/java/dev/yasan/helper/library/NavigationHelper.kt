package dev.yasan.helper.library

import android.content.Context
import android.content.Intent

object NavigationHelper {

    fun startIntentAndClearHistory(context: Context, intent: Intent) {
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        context.startActivity(intent)
    }

}

fun Context.startIntentAndClearHistory(intent: Intent) =
    NavigationHelper.startIntentAndClearHistory(this, intent)