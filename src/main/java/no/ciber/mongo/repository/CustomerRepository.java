package no.ciber.mongo.repository;

import no.ciber.mongo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 */
@Repository
public class CustomerRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Customer createUser(Customer customer) {
        mongoTemplate.save(customer);
        return customer;
    }

    public List<Customer> findAll() {
        return mongoTemplate.findAll(Customer.class);
    }

}
