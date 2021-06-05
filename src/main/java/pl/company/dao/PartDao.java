package pl.company.dao;

import org.springframework.stereotype.Component;
import pl.company.model.Part;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class PartDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void savePart(Part part) {

        entityManager.persist(part);
    }

    public Part findById(long id) {

        return entityManager.find(Part.class, id);
    }

    public void update(Part part) {

        entityManager.merge(part);
    }

    public void delete(long id) {

        Part byId = findById(id);
        if (byId != null) {
            entityManager.remove(byId);
        }
    }

    public List<Part> findAll() {
        Query selectAll = entityManager.
                createQuery("SELECT a FROM Part a");
        return selectAll.getResultList();
    }

}
