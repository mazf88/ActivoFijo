package activo.entities.service;

import activo.entities.Activofijo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Clase con la implementacion de metodos a nivel de base de datos.
 * @author Mazf
 */
@Stateless
@Path("activo.entities.activofijo")
public class ActivofijoFacadeREST extends AbstractFacade<Activofijo> {
    @PersistenceContext(unitName = "ActivoFijoPU")
    private EntityManager em;

    public ActivofijoFacadeREST() {
        super(Activofijo.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Activofijo entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Activofijo entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Activofijo find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Activofijo> findAll() {
        return super.findAll();
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
