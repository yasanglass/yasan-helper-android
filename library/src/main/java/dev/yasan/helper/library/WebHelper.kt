package dev.yasan.helper.library

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.content.ContextCompat

object WebHelper {

    val playStoreAppPrefix = "https://play.google.com/store/apps/details?id="

    fun openWebView(context: Context, url: String?) {
        val builder: CustomTabsIntent.Builder = CustomTabsIntent.Builder()
        val intent: CustomTabsIntent = builder.build()
        intent.intent.putExtra(
            Intent.EXTRA_REFERRER,
            Uri.parse("android-app://" + context.packageName)
        )
        intent.intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        intent.launchUrl(context, Uri.parse(url))
    }

    fun openAppOnPlayStore(context: Context) {
        val url = playStoreAppPrefix + context.packageName
        val builder: CustomTabsIntent.Builder = CustomTabsIntent.Builder()
        val intent: CustomTabsIntent = builder.build()
        intent.intent.putExtra(
            Intent.EXTRA_REFERRER,
            Uri.parse("android-app://" + context.packageName)
        )
        intent.intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        intent.launchUrl(context, Uri.parse(url))
    }

}