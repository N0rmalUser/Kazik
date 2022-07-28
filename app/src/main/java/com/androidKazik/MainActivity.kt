package com.androidKazik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var mButton1:Button
    private lateinit var mButton2:Button
    private lateinit var mButton3:Button
    private lateinit var mButton4:Button
    private lateinit var mButton5:Button
    private lateinit var mButton6:Button
    private lateinit var mButton7:Button
    private lateinit var mButton8:Button
    private lateinit var mButton9:Button
    private lateinit var mButton10:Button
    private lateinit var mTextView:TextView
    private var mIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mButton1 = findViewById(R.id.button1)
        mButton1.setOnClickListener {
            val x=1
            qwe(x)
        }
        mButton2 = findViewById(R.id.button2)
        mButton2.setOnClickListener {
            val x=2
            qwe(x)
        }
        mButton3 = findViewById(R.id.button3)
        mButton3.setOnClickListener {
            val x=3
            qwe(x)
        }
        mButton4 = findViewById(R.id.button4)
        mButton4.setOnClickListener {
            val x=4
            qwe(x)
        }
        mButton5 = findViewById(R.id.button5)
        mButton5.setOnClickListener {
            val x=5
            qwe(x)
        }
        mButton6 = findViewById(R.id.button6)
        mButton6.setOnClickListener {
            val x=6
            qwe(x)
        }
        mButton7 = findViewById(R.id.button7)
        mButton7.setOnClickListener {
            val x=7
            qwe(x)
        }
        mButton8 = findViewById(R.id.button8)
        mButton8.setOnClickListener {
            val x=8
            qwe(x)
        }
        mButton9 = findViewById(R.id.button9)
        mButton9.setOnClickListener {
            val x=9
            qwe(x)
        }
        mButton10 = findViewById(R.id.button10)
        mButton10.setOnClickListener {
            val x=10
            qwe(x)
        }

    }

    private fun qwe(x:Int) {
        val rand = (1..10).random()
        val messageWin =R.string.win
        val messageLoss =R.string.loss
        if (x==rand) {
            mIndex+=1
            Toast.makeText(this, messageWin, Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this, messageLoss, Toast.LENGTH_SHORT).show()
        }
        mTextView.text = "Ты выиграл $mIndex раз(a)"

    }
}



