package lld3.bookmyshow.repositories;

import lld3.bookmyshow.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {
    //Show save(Show build);

    //Optional<Show> findById(Long id);
}