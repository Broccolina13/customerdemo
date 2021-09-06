package net.proselyte.customerdemo.service;

import lombok.extern.slf4j.Slf4j;
import net.proselyte.customerdemo.model.Customer;
import net.proselyte.customerdemo.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Slf4j //??? логирование
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    Logger logger = LoggerFactory.getLogger(Customer.class);    //??

    @Override
    public Customer getById(Long id) {
        logger.info("IN CustomerServiceImpl getById {}", id);
        return customerRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(""));
    }

    @Override
    public void save(Customer customer) {
        logger.info("IN CustomerServiceImpl save {}", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        logger.info("IN CustomerServiceImpl delete {}", id);
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        logger.info("IN CustomerServiceImpl getAll");
        Iterable<Customer> customers = customerRepository.findAll();
        return StreamSupport
                .stream(customers.spliterator(), false)
                .collect(Collectors.toList());
    }
}
