package com.example.orderservice.domain.order

import com.example.orderservice.random

class Order(val userId: String, val lineItems: List<LineItem>) {
    val id: String = ('a'..'z').random(16)
}