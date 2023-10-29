package lld3.bookmyshow.repositories;

import lld3.bookmyshow.models.Hall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HallRepository extends JpaRepository<Hall, Long> {
    //Hall save(Hall hallRequest);

    //Optional<Hall> findById(Long id);
}