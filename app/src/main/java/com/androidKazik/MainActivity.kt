package com.androidKazik

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

open class MainActivity : AppCompatActivity() {
    private lateinit var mButton1: Button
    private lateinit var mButton2: Button
    private lateinit var mButton3: Button
    private lateinit var mButton4: Button
    private lateinit var mButton5: Button
    private lateinit var mButton6: Button
    private lateinit var mButton7: Button
    private lateinit var mButton8: Button
    private lateinit var mButton9: Button
    private lateinit var mButton10: Button
    private lateinit var mTextView: TextView
    private lateinit var mChislo: TextView
    private lateinit var mCheckbox:CheckBox
    var mIndex = 0
    var q = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mButton1 = findViewById(R.id.button1)
        mButton1.setOnClickListener { qwe(1) }
        mButton2 = findViewById(R.id.button2)
        mButton2.setOnClickListener { qwe(2) }
        mButton3 = findViewById(R.id.button3)
        mButton3.setOnClickListener { qwe(3) }
        mButton4 = findViewById(R.id.button4)
        mButton4.setOnClickListener { qwe(4) }
        mButton5 = findViewById(R.id.button5)
        mButton5.setOnClickListener { qwe(5) }
        mButton6 = findViewById(R.id.button6)
        mButton6.setOnClickListener { qwe(6) }
        mButton7 = findViewById(R.id.button7)
        mButton7.setOnClickListener { qwe(7) }
        mButton8 = findViewById(R.id.button8)
        mButton8.setOnClickListener { qwe(8) }
        mButton9 = findViewById(R.id.button9)
        mButton9.setOnClickListener { qwe(9) }
        mButton10 = findViewById(R.id.button10)
        mButton10.setOnClickListener { qwe(10) }
        mChislo = findViewById(R.id.chislo)
        mTextView = findViewById(R.id.textview)
        mCheckbox = findViewById(R.id.checkBox)
        mCheckbox.setOnClickListener {
            q = when(q){
                false -> true
                true-> false
            }
        }
    }

    @SuppressLint("SetTextI18n")
    fun qwe(x: Int) {
        val rand = (1..10).random()
        if (q){
            if (x == rand) {
                mIndex += 1
                Toast.makeText(this, R.string.win, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, R.string.loss, Toast.LENGTH_SHORT).show()
            }
        }else{
            if (x == rand) {
                mIndex += 1
            }
        }
        when (mIndex) {// мне было лень придумывать или искать функцию для определения, будет ли в конце слова стоять "а" или нет.
            2, 3, 4, 22, 23, 24, -> "Ты выиграл $mIndex раза"
            0, 1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 25, 26, 27, 28, 29, 30 -> "Ты выиграл $mIndex раз"
            else -> ("Ты выиграл $mIndex раз(а)")
        }.also { mTextView.text = it }
        mChislo.text = "Ты выбрал: $x \nПравильный ответ: $rand"
    }
}
