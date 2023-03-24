package br.com.vsacademy.controller

import br.com.vsacademy.model.InventoryMovement
import br.com.vsacademy.service.InventoryMovementService
import javax.ws.rs.core.Response
import java.util.UUID

class InventoryMovementController {

    private val inventoryMovementService by lazy { InventoryMovementService() }

    fun create(movement: InventoryMovement): Response {
        val movementCreated = inventoryMovementService.create(movement)
        return Response.ok(movementCreated).build()
    }

    fun index(id: UUID): Response {
        val movement = inventoryMovementService.index(id)
        return Response.ok(movement).build()
    }

}