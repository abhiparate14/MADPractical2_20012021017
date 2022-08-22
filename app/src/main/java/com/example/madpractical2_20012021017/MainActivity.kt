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
        Log.i(TAG, "onCreate: OnCreate Method is called")
        Toast.makeText(
            this,
            "onCreate: OnCreate Method is called",
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
        Log.i(TAG, "onStart: OnStart Method is called")
        Toast.makeText(
            this,
            "onStart: OnStart Method is called",
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
        Log.i(TAG, "onResume: OnResume Method is called")
        Toast.makeText(
            this,
            "onResume: Onresume Method is called",
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
    }
}