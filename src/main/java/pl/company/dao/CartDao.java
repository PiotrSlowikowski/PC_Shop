package pl.company.dao;

import org.springframework.stereotype.Component;
import pl.company.model.Cart;
import pl.company.model.Part;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class CartDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveCart(Cart cart) {

        entityManager.persist(cart);
    }

    public Cart findById(long id) {

        return entityManager.find(Cart.class, id);
    }

    public void update(Cart cart) {

        entityManager.merge(cart);
    }

    public void delete(long id) {

        Cart byId = findById(id);
        if (byId != null) {
            entityManager.remove(byId);
        }
    }

    public List<Part> findAll() {
        Query selectAll = entityManager.
                createQuery("SELECT a FROM Cart a");
        return selectAll.getResultList();
    }

}
