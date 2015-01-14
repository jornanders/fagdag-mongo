package no.ciber.mongo;

import no.ciber.mongo.model.Customer;
import no.ciber.mongo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping(value="customers", produces= MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> findAll() {
        return ok(repository.findAll());
    }


}
