package org.example.fastapi_to_springboot.controller;

import java.time.LocalDate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    private final BookingService bookingService;

    // Injection par constructeur (pas besoin de @Autowired)
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    // a. GET /booking
    @GetMapping
    public List<Booking> getBookings() {
        return bookingService.getAllBookings();
    }

    // b. POST /booking
    @PostMapping
    public ResponseEntity<?> createBooking(@RequestBody Booking booking) {

        // d. vérification numéro chambre
        if (booking.getRoomNumber() < 1 || booking.getRoomNumber() > 9) {
            return ResponseEntity
                    .badRequest()
                    .body("Room number must be between 1 and 9");
        }

        try {
            bookingService.addBooking(booking);
            return ResponseEntity.ok(booking);
        } catch (RuntimeException e) {

            // c. chambre déjà réservée
            return ResponseEntity
                    .status(409)
                    .body("Room already booked for this date");
        }
    }
}