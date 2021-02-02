package dev.yasan.helper.library

import android.content.Context
import androidx.core.content.ContextCompat

/**
 * A helper class with a set of functions that help with resources related difficulties in Android applications.
 * @author Yasan Ghafariyan
 */
object ResourcesHelper {

    /**
     * Gets the requested Color using [ContextCompat]
     * @param resourceId the Color's resource id
     */
    fun getColorWithContext(context: Context, resourceId: Int) =
        ContextCompat.getColor(context, resourceId)

    /**
     * Gets the requested Drawable using [ContextCompat]
     * @param resourceId the Drawable's resource id
     */
    fun getDrawableWithContext(context: Context, resourceId: Int) =
        ContextCompat.getDrawable(context, resourceId)

}

/**
 * Gets the requested Color using [ContextCompat]
 * @param resourceId the Color's resource id
 */
fun Context.getColorWithContext(resourceId: Int) =
    ResourcesHelper.getColorWithContext(this, resourceId)

/**
 * Gets the requested Drawable using [ContextCompat]
 * @param resourceId the Drawable's resource id
 */
fun Context.getDrawableWithContext(resourceId: Int) =
    ResourcesHelper.getDrawableWithContext(this, resourceId)