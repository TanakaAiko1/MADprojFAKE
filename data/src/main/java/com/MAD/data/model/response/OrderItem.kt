package com.MAD.data.model.response

import kotlinx.serialization.Serializable

@Serializable
data class OrderItem(
    val id: Int,
    val orderId: Int,
    val price: Double,
    val productId: Int,
    val productName: String,
    val quantity: Int,
    val userId: Int
) {
    fun toDomainResponse(): com.MAD.domain.model.OrderProductItem {
        return com.MAD.domain.model.OrderProductItem(
            id = id,
            orderId = orderId,
            price = price,
            productId = productId,
            productName = productName,
            quantity = quantity,
            userId = userId
        )
    }
}