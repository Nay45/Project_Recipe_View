package com.example.uklezbeut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.Menu
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var bahan1: TextView
    private lateinit var bahan2: TextView
    private lateinit var bahan3: TextView
    private lateinit var bahan4: TextView
    private lateinit var bahan5: TextView
    private lateinit var bahan6: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayShowTitleEnabled(false)

        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setLogo(R.drawable.ic_back)
        supportActionBar?.setDisplayUseLogoEnabled(true)

        bahan1 = findViewById(R.id.bahan1)
        bahan2 = findViewById(R.id.bahan2)
        bahan3 = findViewById(R.id.bahan3)
        bahan4 = findViewById(R.id.bahan4)
        bahan5 = findViewById(R.id.bahan5)
        bahan6 = findViewById(R.id.bahan6)

        bahan1.text = Html.fromHtml(
            "<b>3 siung bawang putih</b>, haluskan"
        )
        bahan2.text = Html.fromHtml(
            "<b>50-75 gr margarin</b>, lelehkan"
        )
        bahan3.text = Html.fromHtml(
            "<b>50 gr saus tomat</b>"
        )
        bahan4.text = Html.fromHtml(
            "<b>1 sdm mayonaise</b>"
        )
        bahan5.text = Html.fromHtml(
            "<b>1 sdm keju parmesan atau keju cheddar</b>, parut halus"
        )
        bahan6.text = Html.fromHtml(
            "<b>1,5 sdm brown sugar atau gula pasir</b>"
        )

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.action_menu, menu)
        return true
    }

}