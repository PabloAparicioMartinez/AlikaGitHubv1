package com.example.alikagithubv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Esto estará en el segundo commit")
        println("Esto estará en el tercer commit")
        println("Esto estará en el cuarto commit")
        println("Commit en Branch_02")

        println("Cambio A (master)")
    }
}