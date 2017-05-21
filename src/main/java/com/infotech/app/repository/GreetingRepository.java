package com.infotech.app.repository;

import com.infotech.app.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The GreetingRepository interface is a Spring Data JPA data repository for
 * Greeting entities. The GreetingRepository provides all the data access
 * behaviors exposed by <code>JpaRepository</code> and additional custom
 * behaviors may be defined in this interface.
 * 
 * @author MohammadReza Alagheband
 */
@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}
