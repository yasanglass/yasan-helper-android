package dev.yasan.helper.library

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.browser.customtabs.CustomTabsIntent

/**
 * A helper class with a set of functions that help with web related difficulties in Android applications.
 * @author Yasan Ghafariyan
 */
object WebHelper {

    /**
     * The prefix of every app's Google Play Store's page. Just add your app's packageName to it end of it.
     */
    const val PLAY_STORE_APP_LINK_PREFIX = "https://play.google.com/store/apps/details?id="
    private const val APP_REF_PREFIX = "android-app://"

    /**
     * Opens the URL in a web view. It also sets the app's package name as the referrer.
     */
    fun openWebView(context: Context, url: String) {
        val builder: CustomTabsIntent.Builder = CustomTabsIntent.Builder()
        val intent: CustomTabsIntent = builder.build()
        intent.intent.putExtra(
            Intent.EXTRA_REFERRER,
            Uri.parse(APP_REF_PREFIX + context.packageName)
        )
        intent.intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        intent.launchUrl(context, Uri.parse(url))
    }

    /**
     * Opens your app's Play Store page. It also sets the app's package name as the referrer.
     * @see openWebView
     * @see PLAY_STORE_APP_LINK_PREFIX
     */
    fun openAppOnPlayStore(context: Context) {
        openWebView(context, PLAY_STORE_APP_LINK_PREFIX + context.packageName)
    }

}