package dev.yasan.helper.library

import android.content.Context
import androidx.core.content.ContextCompat

object ResourcesHelper {

    fun getColorWithContext(context: Context, resourceId: Int) =
        ContextCompat.getColor(context, resourceId)

    fun getDrawableWithContext(context: Context, resourceId: Int) =
        ContextCompat.getDrawable(context, resourceId)

}


fun Context.getColorWithContext(resourceId: Int) =
    ResourcesHelper.getColorWithContext(this, resourceId)

fun Context.getDrawableWithContext(resourceId: Int) =
    ResourcesHelper.getDrawableWithContext(this, resourceId)