package lld3.bookmyshow.dtos;

import lld3.bookmyshow.enums.MovieFeature;
import lld3.bookmyshow.enums.SeatType;
import lombok.Data;
import org.springframework.data.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class CreateHallRequest {
    private String name;
    private List<MovieFeature> features = new ArrayList<>();
    private Map<SeatType, List<SeatPosition>> seatRanges = new HashMap<>();
}