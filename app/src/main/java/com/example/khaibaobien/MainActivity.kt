package com.example.khaibaobien

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var number = (1..10).random()
        var result = if (number % 2 ==0){
            Log.d("bbb","$number là số chẵn")
            100
        }else if (number == 0){
            Log.d("bbb","$number = 0")
            "aaa"
        }else if (number % 2 != 0){
            Log.d("bbb","$number là số lẻ")
            123
        }else
            1234
        Log.d("bbb",result.toString());

        when (number){
            in 1..2 -> actionBar
            10 ->12
            else 123
        }
    }
}