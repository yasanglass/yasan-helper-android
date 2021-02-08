package dev.yasan.helper.library

import android.view.View

/**
 * A helper class with a set of functions that help with general difficulties in Android applications.
 * @author Yasan Ghafariyan
 */
object AppHelper {

    /**
     * @return if the String can be converted to Int
     * @author Yasan Ghafariyan
     */
    fun isInteger(string: String?) = string?.toIntOrNull()?.let { true } ?: false

    /**
     * @return if the String can be converted to Float
     * @author Yasan Ghafariyan
     */
    fun isFloat(string: String?) = string?.toFloatOrNull()?.let { true } ?: false

    /**
     * @return if the String can be converted to Long
     * @author Yasan Ghafariyan
     */
    fun isLong(string: String?) = string?.toLongOrNull()?.let { true } ?: false

    /**
     * @return if the String can be converted to Double
     * @author Yasan Ghafariyan
     */
    fun isDouble(string: String?) = string?.toDoubleOrNull()?.let { true } ?: false

    /**
     * @return if the String is numeric
     * @author Yasan Ghafariyan
     */
    fun isNumeric(string: String?): Boolean {
        return string?.matches("-?\\d+(\\.\\d+)?".toRegex()) ?: false
    }

    /**
     * Clear previously set OnClickListener on the view
     * @author Yasan Ghafariyan
     */
    fun clearOnClickListener(view: View) = view.setOnClickListener { }
}

/**
 * @return if the String can be converted to Int
 * @author Yasan Ghafariyan
 */
fun String.isInteger() = AppHelper.isInteger(this)

/**
 * @return if the String can be converted to Float
 * @author Yasan Ghafariyan
 */
fun String.isFloat() = AppHelper.isFloat(this)

/**
 * @return if the String can be converted to Long
 * @author Yasan Ghafariyan
 */
fun String.isLong() = AppHelper.isLong(this)

/**
 * @return if the String can be converted to Double
 * @author Yasan Ghafariyan
 */
fun String.isDouble() = AppHelper.isDouble(this)

/**
 * @return if the String is numeric
 * @author Yasan Ghafariyan
 */
fun String.isNumeric() = AppHelper.isNumeric(this)

/**
 * Clear previously set OnClickListener on the view
 * @author Yasan Ghafariyan
 */
fun View.clearOnClickListener() = setOnClickListener { }