package org.example.fastapi_to_springboot.service;


import org.example.fastapi_to_springboot.model.Booking;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {

    private List<Booking> bookings = new ArrayList<>();

    public List<Booking> getAllBookings() {
        return bookings;
    }

    public void addBooking(Booking booking) {

        for (Booking b : bookings) {
            if (b.getRoomNumber() == booking.getRoomNumber()
                    && b.getBookingDate().equals(booking.getBookingDate())) {

                throw new RuntimeException("Room already booked");
            }
        }

        bookings.add(booking);
    }
}
