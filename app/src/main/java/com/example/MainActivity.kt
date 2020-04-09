package com.example

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            startActivity(Intent(this, AddProductActivity::class.java))
        }

        val products = listOf(
            Product("iPod", "Daniel", 2006, 260.59),
            Product("Pixel", "John", 2009, 12.34),
            Product("Mac", "Nathan", 2020, 4999.99),
            Product("Monitor", "Hannah", 1999, 500.00),
            Product("Kotlin", "Mel", 1776, 0.0),
            Product("MacBook Pro", "Daniel Malone", 2020, 4399.99)
        )

        var totalCost = 0.0

        products.forEach {
            productsTextView.append("${it.name} - ${it.owner} - ${it.yearPurchased} - $ ${it.cost} \n\n")
            totalCost += it.cost
        }

        totalCostTextView.text = "$ $totalCost"

    }
}
