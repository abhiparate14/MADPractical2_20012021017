package com.example.madpractical2_20012021017

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var mycl:ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl=findViewById(R.id.mycl)
        Log.i(TAG, "OnCreate Method is called")
        Toast.makeText(
            this,
            "OnCreate Method is called",
            Toast.LENGTH_LONG
        ).show()
        Snackbar.make(
            mycl,
            R.string.oncreatemsg,
            Snackbar.LENGTH_SHORT
        ).show()
    }

    override fun onStart() {
        super.onStart()
        mycl=findViewById(R.id.mycl)
        Log.i(TAG, "OnStart Method is called")
        Toast.makeText(
            this,
            "OnStart Method is called",
            Toast.LENGTH_LONG
        ).show()
        Snackbar.make(
            mycl,
            R.string.onstartmsg,
            Snackbar.LENGTH_SHORT
        ).show()
    }

    override fun onResume() {
        super.onResume()
        mycl=findViewById(R.id.mycl)
        Log.i(TAG, "OnResume Method is called")
        Toast.makeText(
            this,
            "Onresume Method is called",
            Toast.LENGTH_LONG
        ).show()
        Snackbar.make(
            mycl,
            R.string.onresumemsg,
            Snackbar.LENGTH_SHORT
        ).show()
    }

    override fun onPause() {
        super.onPause()
        mycl=findViewById(R.id.mycl)
        Log.i(TAG, "OnPause Method is called")
        Toast.makeText(
            this,
            "OnPause Method is called",
            Toast.LENGTH_LONG
        ).show()
        Snackbar.make(
            mycl,
            R.string.onpause,
            Snackbar.LENGTH_SHORT
        ).show()
    }

    override fun onStop() {
        super.onStop()
        mycl=findViewById(R.id.mycl)
        Log.i(TAG, "OnStop Method is called")
        Toast.makeText(
            this,
            "OnStop Method is called",
            Toast.LENGTH_LONG
        ).show()
        Snackbar.make(
            mycl,
            R.string.onstop,
            Snackbar.LENGTH_SHORT
        ).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        mycl=findViewById(R.id.mycl)
        Log.i(TAG, "OnDestroy Method is called")
        Toast.makeText(
            this,
            "OnDestroy Method is called",
            Toast.LENGTH_LONG
        ).show()
        Snackbar.make(
            mycl,
            R.string.ondestroy,
            Snackbar.LENGTH_SHORT
        ).show()
    }
}