package com.example.human

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("〇〇", 3, "～～")      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        human.think()
    }
}
