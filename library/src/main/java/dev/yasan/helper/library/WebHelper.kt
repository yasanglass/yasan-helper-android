package dev.yasan.helper.library

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.browser.customtabs.CustomTabsIntent

object WebHelper {

    const val PLAY_STORE_APP_LINK_PREFIX = "https://play.google.com/store/apps/details?id="

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
        val url = PLAY_STORE_APP_LINK_PREFIX + context.packageName
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