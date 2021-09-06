package net.proselyte.customerdemo.repository;

import net.proselyte.customerdemo.model.Customer;
import org.springframework.data.repository.CrudRepository;

/*
* Repository interface for {@link Customer} class.
*/
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
