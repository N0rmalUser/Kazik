package com.androidKazik

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
    private  val WIN_INDEX = "win_index"
    private  val INDEX = "index"
    private var mIndex = 0
    private var q = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate()")
        if (savedInstanceState != null ) {
            q = savedInstanceState.getBoolean(INDEX,false)
        }
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
        mButton10.setOnClickListener { qwe(0) }
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

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart()")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause()")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume()")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop()")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy()")
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "onSaveInstanceState")
        outState.putInt(WIN_INDEX, mIndex)
        outState.putBoolean(INDEX, q)
    }

    @SuppressLint("SetTextI18n")
    fun qwe(x: Int) {
        Log.d(TAG, "Кнопка нажата")
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
            2, 3, 4, 22, 23, 24 -> "Ты выиграл $mIndex раза"
            0, 1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 25, 26, 27, 28, 29, 30 -> "Ты выиграл $mIndex раз"
            else -> ("Ты выиграл $mIndex раз(а)")
        }.also { mTextView.text = it }
        mChislo.text = "Ты выбрал: $x \nПравильный ответ: $rand"
    }
}
