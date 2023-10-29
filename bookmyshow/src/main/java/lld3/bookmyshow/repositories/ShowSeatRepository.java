package lld3.bookmyshow.repositories;

import lld3.bookmyshow.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
    List<ShowSeat> findAllByShow_HallId(Long id);

    //List<ShowSeat> saveAll(List<ShowSeat> showSeats);

    //List<ShowSeat> findAllById(List<Long> showSeatIds);
}