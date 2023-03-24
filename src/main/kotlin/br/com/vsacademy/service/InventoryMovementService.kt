package br.com.vsacademy.service

import br.com.vsacademy.model.InventoryMovement
import br.com.vsacademy.repository.InventoryMovementRepository
import java.util.Optional
import java.util.UUID
import javax.ws.rs.core.Response

import com.mongodb.client.MongoClient

class InventoryMovementService {

    private val repository by lazy { InventoryMovementRepository() }

    fun create(movement: InventoryMovement): String {
        // We should implement business logic here!
        // Some business logic to implement:
        //  - The product of the inventory movement has to exist in product-service microsservice
        //  - This microsservice should have a movement of first good receipt for this product  
        return repository.create(movement)
    }

    fun index(id: UUID): String {
        // we should business logic here
        return repository.index(id)
    }
    
}