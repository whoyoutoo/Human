package com.example.human

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("中村", 3, "～～")
        human.say()
        human.think()

        val kai = Human("甲斐",3,"読書")
        kai.say()
        kai.think()

    }
}
