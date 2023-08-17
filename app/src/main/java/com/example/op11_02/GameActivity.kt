package com.example.op11_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.content.ContextCompat

class GameActivity : AppCompatActivity() {

    private lateinit var a1: Button
    private lateinit var a2: Button
    private lateinit var a3: Button

    private lateinit var b1: Button
    private lateinit var b2: Button
    private lateinit var b3: Button

    private lateinit var c1: Button
    private lateinit var c2: Button
    private lateinit var c3: Button

    private lateinit var text: TextView
    private lateinit var start: ImageButton

    private var currentTurn: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        listeners()
        initComponents() // Alt + Enter // Option + Enter
    }

    private fun listeners() {
        a1.setOnClickListener {
            if (a1.text == "" && currentTurn < 9) {
                if (currentTurn % 2 == 0) {
                    a1.text = "X"
                    currentTurn++
                    ui() // Alt + Enter
                } else {
                    a1.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }
        a2.setOnClickListener {
            if (a2.text == "" && currentTurn < 9) {
                if (currentTurn % 2 == 0) {
                    a2.text = "X"
                    currentTurn++
                    ui() // Alt + Enter
                } else {
                    a2.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }
        a3.setOnClickListener {
            if (a3.text == "" && currentTurn < 9) {
                if (currentTurn % 2 == 0) {
                    a3.text = "X"
                    currentTurn++
                    ui() // Alt + Enter
                } else {
                    a3.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }
        b1.setOnClickListener {
            if (b1.text == "" && currentTurn < 9) {
                if (currentTurn % 2 == 0) {
                    b1.text = "X"
                    currentTurn++
                    ui() // Alt + Enter
                } else {
                    b1.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }
        b2.setOnClickListener {
            if (b2.text == "" && currentTurn < 9) {
                if (currentTurn % 2 == 0) {
                    b2.text = "X"
                    currentTurn++
                    ui() // Alt + Enter
                } else {
                    b2.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }
        b3.setOnClickListener {
            if (b2.text == "" && currentTurn < 9) {
                if (currentTurn % 2 == 0) {
                    b2.text = "X"
                    currentTurn++
                    ui() // Alt + Enter
                } else {
                    b2.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        b3.setOnClickListener {
            if (b3.text == "" && currentTurn < 9) {
                if (currentTurn % 2 == 0) {
                    b3.text = "X"
                    currentTurn++
                    ui() // Alt + Enter
                } else {
                    b3.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        c1.setOnClickListener {
            if (c1.text == "" && currentTurn < 9) {
                if (currentTurn % 2 == 0) {
                    c1.text = "X"
                    currentTurn++
                    ui() // Alt + Enter
                } else {
                    c1.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        c2.setOnClickListener {
            if (c2.text == "" && currentTurn < 9) {
                if (currentTurn % 2 == 0) {
                    c2.text = "X"
                    currentTurn++
                    ui() // Alt + Enter
                } else {
                    c2.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        c3.setOnClickListener {
            if (c3.text == "" && currentTurn < 9) {
                if (currentTurn % 2 == 0) {
                    c3.text = "X"
                    currentTurn++
                    ui() // Alt + Enter
                } else {
                    c3.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        start.setOnClickListener {
            a1.text = ""
            a1.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            a2.text = ""
            a2.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            a3.text = ""
            a3.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            b1.text = ""
            b1.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            b2.text = ""
            b2.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            b3.text = ""
            b3.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            c1.text = ""
            c1.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            c2.text = ""
            c2.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            c3.text = ""
            c3.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            currentTurn = 0
            ui()
        }

    }

    private fun ui() {
        if (currentTurn % 2 == 0) {
            text.text = "X"
        } else {
            text.text = "O"
        }

        if ((a1.text == a2.text && a2.text == a3.text) && a1.text != "") {
            a1.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            a2.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            a3.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
        }
    }

    private fun initComponents() {
        a1.findViewById(R.id.a1)
        a2.findViewById(R.id.a2)
        a3.findViewById(R.id.a3)
        b1.findViewById(R.id.b1)
        b2.findViewById(R.id.b2)
        b3.findViewById(R.id.b3)
        c1.findViewById(R.id.c1)
        c2.findViewById(R.id.c2)
        c3.findViewById(R.id.c3)

        text = findViewById(R.id.text)
        start = findViewById(R.id.start)
    }
}