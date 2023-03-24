package br.com.vsacademy.app

import com.mongodb.ConnectionString
import com.mongodb.MongoClientSettings
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import org.bson.UuidRepresentation;

const val CONN_STRING: String = "mongodb://root:example@localhost:27017"

/**
 * Class to create a MongoDB connection
 */
class MongoDbConnection {

    fun createConnection(): MongoClient {
        val connString = ConnectionString(CONN_STRING)
        val settings = MongoClientSettings.builder()
                                          .applyConnectionString(connString)
                                          .uuidRepresentation(UuidRepresentation.STANDARD)
                                          .build()
        return MongoClients.create(settings)
    }
    
}
