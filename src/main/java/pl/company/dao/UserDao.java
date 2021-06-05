package pl.company.dao;

import org.springframework.stereotype.Component;
import pl.company.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveUser(User user) {

        entityManager.persist(user);
    }

    public User findById(long id) {

        return entityManager.find(User.class, id);
    }

    public void update(User user) {

        entityManager.merge(user);
    }

    public void delete(long id) {

        User byId = findById(id);
        if (byId != null) {
            entityManager.remove(byId);
        }
    }

    public List<User> findAll() {
        Query selectAll = entityManager.
                createQuery("SELECT a FROM User a");
        return selectAll.getResultList();
    }

}
