package lld3.bookmyshow.repositories;

import lld3.bookmyshow.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    //Optional<Movie> findById(Long movieId);

    //Movie save(Movie movie);
}