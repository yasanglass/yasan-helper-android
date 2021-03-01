package dev.yasan.helper.library

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.core.graphics.ColorUtils

/**
 * A helper class with a set of functions that help with resources related difficulties in Android applications.
 * @author Yasan Ghafariyan
 */
object ResourcesHelper {

    /**
     * Gets the requested Color using [ContextCompat]
     * @param resourceId the Color's resource id
     * @author Yasan Ghafariyan
     */
    fun getColorWithContext(context: Context, resourceId: Int) =
        ContextCompat.getColor(context, resourceId)

    /**
     * Gets the requested Drawable using [ContextCompat]
     * @param resourceId the Drawable's resource id
     * @author Yasan Ghafariyan
     */
    fun getDrawableWithContext(context: Context, resourceId: Int) =
        ContextCompat.getDrawable(context, resourceId)

    /**
     * Checks if the color Int value is a dark or light.
     * @return If the color's luminance is <0.5.
     * @author Yasan Ghafariyan
     */
    fun isColorDark(color: Int) = ColorUtils.calculateLuminance(color) < 0.5

    /**
     * Checks if the color Int value is a dark or light.
     * @return If the color's luminance is >0.5.
     * @author Yasan Ghafariyan
     */
    fun isColorLight(color: Int) = !isColorDark(color)

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

/**
 * Checks if the color Int value is a dark or light.
 * @return If the color's luminance is <0.5.
 * @author Yasan Ghafariyan
 */
fun Int.isColorDark() = ResourcesHelper.isColorDark(this)

/**
 * Checks if the color Int value is a dark or light.
 * @return If the color's luminance is >0.5.
 * @author Yasan Ghafariyan
 */
fun Int.isColorLight() = ResourcesHelper.isColorLight(this)