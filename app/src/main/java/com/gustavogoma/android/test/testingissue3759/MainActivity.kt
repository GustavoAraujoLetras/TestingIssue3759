package com.gustavogoma.android.test.testingissue3759

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (shouldOpenAnotherActivity) {
            shouldOpenAnotherActivity = false

            startActivity(Intent(this, AnotherActivity::class.java))
        }
    }

    override fun onRestart() {
        Log.i(TAG, "onRestart")
        super.onRestart()
    }

    override fun onStart() {
        Log.i(TAG, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i(TAG, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i(TAG, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i(TAG,  "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy")
        super.onDestroy()
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName

        private var shouldOpenAnotherActivity = true
    }
}