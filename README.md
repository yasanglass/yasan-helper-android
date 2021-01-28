# YASAN Helper: Android
[![](https://jitpack.io/v/yasandev/yasan-helper-android.svg)](https://jitpack.io/#yasandev/yasan-helper-android)  [![Build Status](https://travis-ci.com/yasandev/yasan-helper-android.svg?branch=main)](https://travis-ci.com/yasandev/yasan-helper-android)

A simple Android library with useful [Kotlin extension] functions to help you write less code.

## Usage
AppHelper.kt == *General helper functions*

You can also use these functions using `AppHelper` object
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

NavigationHelper.kt == *Navigation helper functions*

You can also use these functions using `NavigationHelper` object.
```kotlin
Context.startIntentAndClearHistory(intent: Intent) // starts an activity and clears the history
```

ResourcesHelper.kt == *Resources helper functions*

You can also use these functions using `ResourcesHelper` object. These functions use `ContextCompat` but you dont have to manually pass `Context`.
```kotlin
fun Context.getColorWithContext(resourceId: Int): Int 

fun Context.getDrawableWithContext(resourceId: Int): Drawable?
```

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
