package com.gustavogoma.android.test.testingissue3759

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

val AppCompatActivity.nightModeEnableAlways: Int
    get() = AppCompatDelegate.MODE_NIGHT_YES

val AppCompatActivity.nightModeDisabledAlways: Int
    get() = AppCompatDelegate.MODE_NIGHT_NO

val AppCompatActivity.isNightModeAlwaysEnabled: Boolean
    get() = currentNightMode == nightModeEnableAlways

var AppCompatActivity.currentNightMode: Int
    get() = AppCompatDelegate.getDefaultNightMode()
    set(value) = AppCompatDelegate.setDefaultNightMode(value)