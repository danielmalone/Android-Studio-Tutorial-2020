package com.example

class ProductsData {

    fun allProducts(): List<Product> {
        return listOf(
            Product("iPod", "Daniel", 2006, 260.59),
            Product("Pixel", "John DANIel", 2009, 12.34),
            Product("Mac", "Nathan", 2020, 4999.99),
            Product("Monitor", "Hannah", 1999, 500.00),
            Product("4K Monitor", "danieljmalone", 2020, 399.00),
            Product("Kotlin", "Mel", 1776, 0.0),
            Product("MacBook Pro", "Daniel John Malone", 2020, 4399.99)
        )
    }
}
