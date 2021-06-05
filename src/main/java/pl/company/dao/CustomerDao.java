package pl.company.dao;

import org.springframework.stereotype.Component;
import pl.company.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class CustomerDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveCustomer(Customer customer) {

        entityManager.persist(customer);
    }

    public Customer findById(long id) {

        return entityManager.find(Customer.class, id);
    }

    public void update(Customer customer) {

        entityManager.merge(customer);
    }

    public void delete(long id) {

        Customer byId = findById(id);
        if (byId != null) {
            entityManager.remove(byId);
        }
    }

    public List<Customer> findAll() {
        Query selectAll = entityManager.
                createQuery("SELECT a FROM Customer a");
        return selectAll.getResultList();
    }

}
