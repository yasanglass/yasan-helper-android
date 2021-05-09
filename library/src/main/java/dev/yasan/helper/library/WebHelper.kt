package dev.yasan.helper.library

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.browser.customtabs.CustomTabsIntent
import dev.yasan.helper.library.WebHelper.PLAY_STORE_APP_LINK_PREFIX
import dev.yasan.helper.library.WebHelper.openWebView

/**
 * A helper class with a set of functions that help with web related difficulties in Android applications.
 * @author Yasan Ghafariyan
 */
object WebHelper {

    /**
     * The prefix of every app's Google Play Store's page. Just add your app's packageName to it end of it.
     *
     * @author Yasan Ghafariyan
     */
    const val PLAY_STORE_APP_LINK_PREFIX = "https://play.google.com/store/apps/details?id="
    private const val APP_REF_PREFIX = "android-app://"

    /**
     * Opens the URL in a web view. It also sets the app's package name as the referrer.
     *
     * @author Yasan Ghafariyan
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
     * Opens your app's Google Play Store page. It also sets the app's package name as the referrer.
     *
     * @see openWebView
     * @see PLAY_STORE_APP_LINK_PREFIX
     *
     * @author Yasan Ghafariyan
     */
    fun openAppOnPlayStore(context: Context) {
        openWebView(context, PLAY_STORE_APP_LINK_PREFIX + context.packageName)
    }

}

/**
 * Opens your app's Google Play Store page. It also sets the app's package name as the referrer.
 *
 * @see openWebView
 * @see PLAY_STORE_APP_LINK_PREFIX
 *
 * @author Yasan Ghafariyan
 */
fun Context.openAppOnPlayStore() = WebHelper.openAppOnPlayStore(this)

/**
 * Opens the URL in a web view. It also sets the app's package name as the referrer.
 *
 * @author Yasan Ghafariyan
 */
fun Context.openWebView(url: String) = WebHelper.openWebView(this, url)