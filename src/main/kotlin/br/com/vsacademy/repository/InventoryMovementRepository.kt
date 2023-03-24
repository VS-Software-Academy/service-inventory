package br.com.vsacademy.repository

import br.com.vsacademy.app.MongoDbConnection
import br.com.vsacademy.model.InventoryMovement

import org.bson.Document
import org.bson.types.ObjectId;

import com.mongodb.DBObject

import javax.ws.rs.core.Response
import java.util.UUID

import com.google.gson.Gson

class InventoryMovementRepository {

    private val movementsCollection by lazy { MongoDbConnection().createConnection().getDatabase("service-inventory-db").getCollection("movements") }

    fun create(movement: InventoryMovement): String {
        movement._id = UUID.randomUUID()
        val document = Gson().toJson(movement)
        movementsCollection.insertOne(Document.parse(document))
        return Gson().toJson(movement)
    }

    fun index(id: UUID): String {
        val query = Document("_id", id.toString())
        val movement = movementsCollection.find(query).first()
        println(query)
        return Gson().toJson(movement)
    }

}