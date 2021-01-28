# YASAN Helper: Android
[![](https://jitpack.io/v/yasandev/yasan-helper-android.svg)](https://jitpack.io/#yasandev/yasan-helper-android)  [![Build Status](https://travis-ci.com/yasandev/yasan-helper-android.svg?branch=main)](https://travis-ci.com/yasandev/yasan-helper-android)

A simple Android library with useful [Kotlin extension] functions to help you write less code.

## Usage
General app helper functions

```kotlin
String.isInteger(): Boolean // == if the string can be converted to interger 

String.isFloat(): Boolean // == if the string can be converted to float 
```
The toast functions below convert the sent object into a String (unless its already a String), toast it & then return the toasted String
```kotlin
Context.toast(message: Any): String

Context.toastLong(message: Any): String

Any.toast(context: Context): String

Any.toastLong(context: Context): String

```
You can also use these functions using `AppHelper` object

---
Navigation helper functions
```kotlin
Context.startIntentAndClearHistory(intent: Intent) // starts an activity and clears the history
```
You can also use these functions using `NavigationHelper` object.

---
Resources helper functions

```kotlin
Context.getColorWithContext(resourceId: Int): Int 

Context.getDrawableWithContext(resourceId: Int): Drawable?
```
These functions use `ContextCompat` but you dont have to manually pass `Context`.

---
SharedPreferences helper functions
```kotlin
Context.getMySharedPreferences(): SharedPreferences

Context.getMySharedPreferencesEditor(): SharedPreferences.Editor
```
You can also use these functions using `SharedPreferencesHelper` object. 

---
View helper functions
```kotlin
fun View.visible() = ViewHelper.visible(this) // == view.visibility = View.VISIBLE

fun View.invisible() = ViewHelper.invisible(this) // == view.visibility = View.INVISIBLE

fun View.gone() = ViewHelper.gone(this) // == view.visibility = View.GONE

fun View.showSnackBar(message: String) 

fun String.showSnackBar(parent: View) 

fun View.showSnackBarOnTop(message: String) 

fun String.showSnackBarOnTop(parent: View)
```
You can also use these functions using `ViewHelper` object. 

---

## Including in your project
This library is available via JitPack, so getting it as simple as adding it as a dependency, like this:

1. Add JitPack repository to your project `build.gradle` file:
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
2. Add the dependency to your module `build.gradle` file:
```gradle
dependencies {
    implementation 'com.github.yasandev:yasan-helper-android:{latest version}'
}
```

You can also use '-SNAPSHOT' to get the snapshot builds.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[GPL-3.0](https://www.gnu.org/licenses/gpl-3.0.txt)
