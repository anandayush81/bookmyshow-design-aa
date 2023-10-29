package lld3.bookmyshow.repositories;

import lld3.bookmyshow.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findCustomerByEmail(String email);

    //Optional<Customer> findById(Long id);

    //Customer save(Customer customer);
}
