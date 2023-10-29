package lld3.bookmyshow.controllers;

import lld3.bookmyshow.dtos.CreateBookingRequest;
import lld3.bookmyshow.models.Booking;
import lld3.bookmyshow.services.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BookingController {

    private BookingService bookingService;
    // Create a booking
    @PostMapping("/booking")
    public Booking createBooking(@RequestBody CreateBookingRequest request) {
        return bookingService.createBooking(request);
    }
}