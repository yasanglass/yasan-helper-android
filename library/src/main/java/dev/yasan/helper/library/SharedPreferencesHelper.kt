package dev.yasan.helper.library

import android.content.Context
import android.content.SharedPreferences

object SharedPreferencesHelper {

    fun getMySharedPreferences(context: Context) =
        context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)

    fun getMySharedPreferencesEditor(context: Context) = getMySharedPreferences(context).edit()

}

fun Context.getMySharedPreferences(): SharedPreferences =
    SharedPreferencesHelper.getMySharedPreferences(this)

fun Context.getMySharedPreferencesEditor(): SharedPreferences.Editor =
    SharedPreferencesHelper.getMySharedPreferencesEditor(this)