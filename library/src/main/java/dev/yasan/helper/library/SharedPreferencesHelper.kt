package dev.yasan.helper.library

import android.content.Context
import android.content.SharedPreferences
import dev.yasan.helper.library.WebHelper.PLAY_STORE_APP_LINK_PREFIX
import dev.yasan.helper.library.WebHelper.openWebView

/**
 * A helper class with a set of functions that help with SharedPreferences related difficulties in Android applications.
 * @author Yasan Ghafariyan
 */
object SharedPreferencesHelper {

    /**
     * @return a SharedPreferences object with standard settings
     */
    fun getMySharedPreferences(context: Context): SharedPreferences =
        context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)

    /**
     * @return a SharedPreferences.Editor object with standard settings
     */
    fun getMySharedPreferencesEditor(context: Context): SharedPreferences.Editor = getMySharedPreferences(context).edit()

}

/**
 * @return a SharedPreferences object with standard settings
 */
fun Context.getMySharedPreferences(): SharedPreferences =
    SharedPreferencesHelper.getMySharedPreferences(this)

/**
 * @return a SharedPreferences.Editor object with standard settings
 */
fun Context.getMySharedPreferencesEditor(): SharedPreferences.Editor =
    SharedPreferencesHelper.getMySharedPreferencesEditor(this)