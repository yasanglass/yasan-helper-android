package dev.yasan.helper.library

import android.app.Activity
import android.content.Context.INPUT_METHOD_SERVICE
import android.view.Gravity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.FrameLayout
import com.google.android.material.snackbar.Snackbar

/**
 * A helper class with a set of functions that help with view related difficulties in Android applications.
 * @author Yasan Ghafariyan
 */
object ViewHelper {

    /**
     * Shows a SnackBar on the bottom of the screen
     * @param parent the View that is the parent of the layout
     * @param message the String that you want to show on the SnackBar
     * @author Yasan Ghafariyan
     */
    fun showSnackBar(parent: View, message: String) =
        Snackbar.make(parent, message, Snackbar.LENGTH_SHORT).show()

    /**
     * Shows a SnackBar on the top of the screen
     * @param parent the View that is the parent of the layout
     * @param message the String that you want to show on the SnackBar
     * @author Yasan Ghafariyan
     */
    fun showSnackBarOnTop(parent: View, message: String) {
        val snack: Snackbar = Snackbar.make(parent, message, Snackbar.LENGTH_LONG)
        val view = snack.view
        val params = view.layoutParams as FrameLayout.LayoutParams
        params.gravity = Gravity.TOP
        view.layoutParams = params
        snack.show()
    }

    /**
     * @return set the view's visibility to [View.VISIBLE]
     * @author Yasan Ghafariyan
     */
    fun visible(view: View) {
        view.visibility = View.VISIBLE
    }

    /**
     * @return set the view's visibility to [View.INVISIBLE]
     * @author Yasan Ghafariyan
     */
    fun invisible(view: View) {
        view.visibility = View.INVISIBLE
    }

    /**
     * @return set the view's visibility to [View.GONE]
     * @author Yasan Ghafariyan
     */
    fun gone(view: View) {
        view.visibility = View.GONE
    }

    /**
     * Closes the keyboard if its showing.
     *
     * @return If it closed the keyboard or it was not showing.
     * @author Yasan Ghafariyan
     */
    fun closeKeyboard(activity: Activity): Boolean {
        return try {
            val inputManager = activity.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            inputManager.hideSoftInputFromWindow(
                activity.currentFocus!!.windowToken,
                InputMethodManager.HIDE_NOT_ALWAYS
            )
            true
        } catch (e: NullPointerException) {
            e.printStackTrace()
            false
        }
    }

}

/**
 * Closes the keyboard if its showing.
 *
 * @return If it closed the keyboard or it was not showing.
 * @author Yasan Ghafariyan
 */
fun Activity.closeKeyboard() = ViewHelper.closeKeyboard(this)

/**
 * Shows a SnackBar on the bottom of the screen
 * @param this the View that is the parent of the layout
 * @param message the String that you want to show on the SnackBar
 * @author Yasan Ghafariyan
 */
fun View.showSnackBar(message: String) =
    ViewHelper.showSnackBar(this, message)

/**
 * Shows a SnackBar on the bottom of the screen
 * @param this the String that you want to show on the SnackBar
 * @param parent the View that is the parent of the layout
 * @author Yasan Ghafariyan
 */
fun String.showSnackBar(parent: View) =
    ViewHelper.showSnackBar(parent, this)

/**
 * Shows a SnackBar on the top of the screen
 * @param this the View that is the parent of the layout
 * @param message the String that you want to show on the SnackBar
 * @author Yasan Ghafariyan
 */
fun View.showSnackBarOnTop(message: String) =
    ViewHelper.showSnackBarOnTop(this, message)

/**
 * Shows a SnackBar on the top of the screen
 * @param this the String that you want to show on the SnackBar
 * @param parent the View that is the parent of the layout
 * @author Yasan Ghafariyan
 */
fun String.showSnackBarOnTop(parent: View) =
    ViewHelper.showSnackBarOnTop(parent, this)

/**
 * @return set the view's visibility to [View.VISIBLE]
 * @author Yasan Ghafariyan
 */
fun View.visible() = ViewHelper.visible(this)

/**
 * @return set the view's visibility to [View.INVISIBLE]
 * @author Yasan Ghafariyan
 */
fun View.invisible() = ViewHelper.invisible(this)

/**
 * @return set the view's visibility to [View.GONE]
 * @author Yasan Ghafariyan
 */
fun View.gone() = ViewHelper.gone(this)