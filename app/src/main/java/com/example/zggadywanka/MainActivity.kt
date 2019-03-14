package com.example.zggadywanka

import android.*
import android.app.*
import android.graphics.Color
import android.os.*
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.*
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.view.*

import java.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private var wylosowanaLiczba: Int = 0
    private var podawanaLiczba: Int = 0


    fun clickButton1(view: View) {

        val pole = findViewById<EditText>(R.id.editText1) as EditText
        pole.filters
        val temp = pole.text.toString()
        podawanaLiczba = temp.toInt()

        sprawdzRownosc(wylosowanaLiczba, podawanaLiczba)
    }


    private fun sprawdzRownosc(a: Int, b: Int) = if (a == b) {
        Toast.makeText(this, "Brawo! Odgadleś wylosowana liczbe.", Toast.LENGTH_SHORT).show()
        findViewById<ConstraintLayout>(R.id.Back).setBackgroundColor(Color.GREEN)
        findViewById<TextView>(R.id.textView).text="Koniec!"
        var button1 = findViewById<Button>(R.id.button1) as Button
        button1.isClickable = false
        button1.visibility = View.INVISIBLE
        val pole = findViewById<EditText>(R.id.editText1) as EditText
        pole.isClickable = false
        pole.visibility = View.INVISIBLE
        val button5 = findViewById<Button>(R.id.button5) as Button
        button5.visibility = View.VISIBLE
        button5.isClickable = true


    } else {
        if (a > b) {
            Toast.makeText(this, "Podaj wieksza liczbe!", Toast.LENGTH_SHORT).show()
            findViewById<ConstraintLayout>(R.id.Back).setBackgroundColor(Color.RED)
        } else {
            Toast.makeText(this, "Podaj mniejsza liczbe!", Toast.LENGTH_SHORT).show()
            findViewById<ConstraintLayout>(R.id.Back).setBackgroundColor(Color.RED)
        }
    }

    fun roll(view: View) {
        val r = (1..100).random()
        this.wylosowanaLiczba = r

        val button5 = findViewById<Button>(R.id.button5) as Button
        button5.visibility = View.INVISIBLE
        button5.isClickable = false
        val button1 = findViewById<Button>(R.id.button1) as Button
        button1.isClickable = true
        button1.visibility = View.VISIBLE
        val pole = findViewById<EditText>(R.id.editText1) as EditText
        pole.isClickable = true
        pole.visibility = View.VISIBLE
        pole.setText("")
        findViewById<ConstraintLayout>(R.id.Back).setBackgroundColor(Color.WHITE)
        findViewById<TextView>(R.id.textView).text="Zgaduj!"
    }

    fun clickStart(view: View) {
        val button4 = findViewById<Button>(R.id.button4) as Button
        button4.isClickable = false
        button4.visibility = View.INVISIBLE
        val button1 = findViewById<Button>(R.id.button1) as Button
        button1.isClickable = true
        button1.visibility = View.VISIBLE
        val pole = findViewById<EditText>(R.id.editText1) as EditText
        pole.isClickable = true
        pole.visibility = View.VISIBLE
    }




    public override fun onCreate(savedInstanceState: Bundle?) {
        val r = (1..100).random()
        this.wylosowanaLiczba = r

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pole = findViewById<EditText>(R.id.editText1) as EditText
        pole.isClickable = false
        pole.visibility = View.INVISIBLE
        val button1 = findViewById<Button>(R.id.button1) as Button
        button1.isClickable = false
        button1.visibility = View.INVISIBLE
        val button5 = findViewById<Button>(R.id.button5) as Button
        button5.visibility = View.INVISIBLE
        button5.isClickable = false
    }
}