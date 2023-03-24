package br.com.vsacademy

import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import org.json.JSONObject
import org.jboss.resteasy.annotations.jaxrs.PathParam
import javax.ws.rs.*
import br.com.vsacademy.model.InventoryMovement
import br.com.vsacademy.controller.InventoryMovementController
import java.util.UUID

@Path("/inventory-movements")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class InventoryMovementResource {

    private val inventoryMovementsController by lazy { InventoryMovementController() }

    @POST
    fun create(movement: InventoryMovement): Response {
        return inventoryMovementsController.create(movement)
    }

    @GET
    @Path("{id}")
    fun index(@PathParam id: UUID): Response {
        return inventoryMovementsController.index(id)
    }

}
