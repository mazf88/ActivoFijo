package activo.entities.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 * Clase que adiciona las clases recursos a la aplicacion.
 * @author Mazf
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Se agregan todos los recursos definidos en el proyecto, en este caso
     * las entidades creadas a partir de la base de datos.
     * @param resources
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(activo.entities.service.ActivofijoFacadeREST.class);
        resources.add(activo.entities.service.AreaFacadeREST.class);
        resources.add(activo.entities.service.CiudadFacadeREST.class);
        resources.add(activo.entities.service.PersonaFacadeREST.class);
    }    
}
