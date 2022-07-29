package com.androidKazik

import android.annotation.SuppressLint
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
    private lateinit var mChislo:TextView
    private var mIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mButton1 = findViewById(R.id.button1)
        mButton2 = findViewById(R.id.button2)
        mButton3 = findViewById(R.id.button3)
        mButton4 = findViewById(R.id.button4)
        mButton5 = findViewById(R.id.button5)
        mButton6 = findViewById(R.id.button6)
        mButton7 = findViewById(R.id.button7)
        mButton8 = findViewById(R.id.button8)
        mButton9 = findViewById(R.id.button9)
        mButton10 = findViewById(R.id.button10)
        mChislo = findViewById(R.id.chislo)
        mTextView=findViewById(R.id.textview)
        mButton1.setOnClickListener { qwe(x=1) }
        mButton2.setOnClickListener { qwe(x=2) }
        mButton3.setOnClickListener { qwe(x=3) }
        mButton4.setOnClickListener { qwe(x=4) }
        mButton5.setOnClickListener { qwe(x=5) }
        mButton6.setOnClickListener { qwe(x=6) }
        mButton7.setOnClickListener { qwe(x=7) }
        mButton8.setOnClickListener { qwe(x=8) }
        mButton9.setOnClickListener { qwe(x=9) }
        mButton10.setOnClickListener { qwe(x=10) }
    }

    @SuppressLint("SetTextI18n")
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
        mTextView.text = when(mIndex) {             // мне было лень придумыватб или искать функцию для определения, будет ли в конце слова стоять "а" или нет.
            2,3,4,22,23,24, ->"Ты выиграл $mIndex раза"
            0,1,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,25,26,27,28,29,30->"Ты выиграл $mIndex раз"
            else -> ("Ты выиграл $mIndex раз(а)")
        }
        mChislo.text = "Ты выбрал: $x \nПравильный ответ: $rand"
    }
}



