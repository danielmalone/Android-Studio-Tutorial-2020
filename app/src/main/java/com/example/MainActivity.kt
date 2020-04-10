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

        val products = ProductsData().allProducts()

        var totalCost = 0.0

        products.forEach {
            if (it.owner.contains(AppConfig.filterByName, true)) {
                productsTextView.append("${it.name} - ${it.owner} - ${it.yearPurchased} - $ ${it.cost} \n\n")
                totalCost += it.cost
            }
        }

        totalCostTextView.text = "$ $totalCost"

    }
}
