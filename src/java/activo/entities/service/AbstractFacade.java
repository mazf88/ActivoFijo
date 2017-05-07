package activo.entities.service;

import java.util.List;
import javax.persistence.EntityManager;

/**
 * Fachada con cada una de las operaciones a realizar a nivel de base de datos.
 * @author Mazf
 * @param <Entity>
 */
public abstract class AbstractFacade<Entity> {
    private final Class<Entity> entityClass;

    public AbstractFacade(Class<Entity> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public void create(Entity entity) {
        getEntityManager().persist(entity);
    }

    public void edit(Entity entity) {
        getEntityManager().merge(entity);
    }

    public void remove(Entity entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public Entity find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public List<Entity> findAll() {
        javax.persistence.criteria.CriteriaQuery criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery();
        criteriaQuery.select(criteriaQuery.from(entityClass));
        return getEntityManager().createQuery(criteriaQuery).getResultList();
    }       
}
