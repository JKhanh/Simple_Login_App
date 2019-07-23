package com.k001.simplelogin

import android.content.Intent
import android.nfc.Tag
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    val TAG : String = "MyActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.colorMain));
        }
        Log.v(TAG, "App created")
    }

    override fun onStart() {
        super.onStart()
        Log.v(TAG, "App starting")
    }

    override fun onResume() {
        super.onResume()
        Log.v(TAG, "App resuming")
    }

    override fun onPause() {
        super.onPause()
        Log.v(TAG, "App paused")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v(TAG, "App restarted")
    }

    override fun onStop() {
        super.onStop()
        Log.v(TAG, "App stopping")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG, "App destroyed")
    }

    public fun signIn(view:View){
        val intent = Intent(this, signUp::class.java)
        startActivity(intent)
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
    }
}
