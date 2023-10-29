package lld3.bookmyshow.strategies;

import lld3.bookmyshow.enums.SeatType;
import lld3.bookmyshow.models.Booking;
import lld3.bookmyshow.models.ShowSeat;
import org.springframework.stereotype.Component;

@Component
public class SeatBasedPricingStrategy implements PricingStrategy {
    private static Double calculatePrice(ShowSeat seat) {
        return getPrice(seat.getSeat().getSeatType());
    }

    private static Double getPrice(SeatType seatType) {
        switch (seatType) {
            case VIP -> {
                return 2000.0;
            }
            case PLATINUM -> {
                return 1000.0;
            }
            case GOLD -> {
                return 500.0;
            }
            case SILVER -> {
                return 250.0;
            }
        }

        throw new IllegalArgumentException("Seat type not valid: " + seatType);
    }

    @Override
    public Double calculatePrice(Booking booking) {
        return booking.getSeats().stream().mapToDouble(
                SeatBasedPricingStrategy::calculatePrice
        ).sum();
    }
}
