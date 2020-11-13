package io.gongracr.dummytest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.gongracr.dummylib.MyDummyClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a = MyDummyClass()
        a.calculateSquare(5)
    }
}