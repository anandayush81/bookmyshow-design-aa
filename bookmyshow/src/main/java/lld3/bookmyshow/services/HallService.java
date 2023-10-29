package lld3.bookmyshow.services;
import lld3.bookmyshow.dtos.CreateHallRequest;
import lld3.bookmyshow.dtos.SeatPosition;
import lld3.bookmyshow.enums.SeatType;
import lld3.bookmyshow.models.Hall;
import lld3.bookmyshow.models.Seat;
import lld3.bookmyshow.repositories.HallRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class HallService {
    private SeatService seatService;
    private HallRepository hallRepository;

    public static List<Seat> toSeats(Hall hall, Map<SeatType, List<SeatPosition>> seatPositions) {

        return seatPositions.entrySet().stream().flatMap(entry -> {

            SeatType seatType = entry.getKey();
            List<SeatPosition> positions = entry.getValue();

            return positions
                    .stream()
                    .map(seatPosition ->
                            Seat.builder()
                                    .seatType(seatType)
                                    .rowNo(seatPosition.getRowNo())
                                    .columnNo(seatPosition.getColumnNo())
                                    .hall(hall)
                                    .build());
        }).toList();
    }

    public Hall createHall(CreateHallRequest request) {

        Hall hallRequest = Hall.builder()
                .name(request.getName())
                .features(request.getFeatures())
                .build();
        Hall initialHall = hallRepository.save(hallRequest);

        List<Seat> seats = toSeats(initialHall, request.getSeatRanges());
        List<Seat> savedSeats = seatService.saveAll(seats);

        return hallRepository.save(initialHall.toBuilder().seats(savedSeats).build());
    }

    public Hall getHall(Long id) {
        return hallRepository.findById(id).orElse(null);
    }
}