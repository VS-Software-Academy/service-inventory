package br.com.vsacademy.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.quarkus.runtime.annotations.RegisterForReflection
import java.util.UUID

@RegisterForReflection
data class InventoryMovement (

    @JsonProperty("_id")
    var _id: UUID?,

    @JsonProperty("type")
    val movementType: InventoryMovementTypes,

    @JsonProperty("productId")
    val productId: String,

    @JsonProperty("quantity")
    val quantity: Float,

    @JsonProperty("stockLocation")
    val stockLocation: String,
)