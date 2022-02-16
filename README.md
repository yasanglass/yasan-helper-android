# YASAN Helper: Android
[![](https://jitpack.io/v/yasandev/yasan-helper-android.svg)](https://jitpack.io/#yasandev/yasan-helper-android)  [![Build Status](https://travis-ci.com/yasandev/yasan-helper-android.svg?branch=main)](https://travis-ci.com/yasandev/yasan-helper-android) [![Codacy Badge](https://app.codacy.com/project/badge/Grade/0bfa8066cad64933857ec1b12097a712)](https://www.codacy.com/gh/yasandev/yasan-helper-android/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=yasandev/yasan-helper-android&amp;utm_campaign=Badge_Grade)

**DEPRECATED: Migrate to [YDK-Android](https://github.com/yasandev/ydk-android).**

A simple Android library with useful (Kotlin extension) functions to help you write less code.

## Usage
**General app helper functions**

```kotlin
String.isNumeric(): Boolean // == if the String is numeric

String.isInteger(): Boolean // == if the string can be converted to Int 

String.isLong(): Boolean // == if the string can be converted to Long 

String.isFloat(): Boolean // == if the string can be converted to Float 

String.isDouble(): Boolean // == if the string can be converted to Double 

View.clearOnClickListener()
```
You can also use these functions using `AppHelper` object

---
**Navigation helper functions**
```kotlin
Context.startIntentAndClearHistory(intent: Intent) // starts an activity and clears the history
```
You can also use these functions using `NavigationHelper` object

---
**Resources helper functions**

```kotlin
Context.getColorWithContext(resourceId: Int): Int 

Context.getDrawableWithContext(resourceId: Int): Drawable?
```
These functions use `ContextCompat` but you dont have to manually pass `Context`

---
**SharedPreferences helper functions**
```kotlin
Context.getMySharedPreferences(): SharedPreferences

Context.getMySharedPreferencesEditor(): SharedPreferences.Editor
```
You can also use these functions using `SharedPreferencesHelper` object

---
**View helper functions**
```kotlin
fun View.visible() = ViewHelper.visible(this) // == view.visibility = View.VISIBLE

fun View.invisible() = ViewHelper.invisible(this) // == view.visibility = View.INVISIBLE

fun View.gone() = ViewHelper.gone(this) // == view.visibility = View.GONE

fun View.showSnackBar(message: String) 

fun String.showSnackBar(parent: View) 

fun View.showSnackBarOnTop(message: String) 

fun String.showSnackBarOnTop(parent: View)

fun Activity.closeKeyboard()
```
You can also use these functions using `ViewHelper` object

---
**Web helper functions**
```kotlin
Context.openWebView(url: String?) // Opens the url in a WebView.
```
```kotlin
// Opens an app's Play Store page. Opens the current app if `packageName` is null.
WebHelper.openAppOnPlayStore(packageName: String? = null)
```
```kotlin
String.isURL() // Checks if the string is a valid URL or not using Regex.
```
You can also use these functions using `WebHelper` object

---
**Clipboard helper functions**
```kotlin
// Copies the string to the clipboard and runs onSuccess if its succeeds.
Context.copyToClipboard(string: String, onSuccess: () -> Unit = {})
```
You can also use these functions using `ClipboardHelper` object


## Including in your project
This library is available via JitPack, so getting it as simple as adding it as a dependency, like this:

1.  Add JitPack repository to your project `build.gradle` file:
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
2.  Add the dependency to your module `build.gradle` file:
```gradle
dependencies {
    implementation 'com.github.yasandev:yasan-helper-android:{latest version}'
}
```

You can also use 'main-SNAPSHOT' to get the snapshot builds.

---

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

---

## License
[GPL-3.0](https://www.gnu.org/licenses/gpl-3.0.txt)
