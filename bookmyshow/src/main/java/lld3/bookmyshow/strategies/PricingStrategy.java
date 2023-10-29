package lld3.bookmyshow.strategies;

import lld3.bookmyshow.models.Booking;

public interface PricingStrategy {
    Double calculatePrice(Booking booking);
}
