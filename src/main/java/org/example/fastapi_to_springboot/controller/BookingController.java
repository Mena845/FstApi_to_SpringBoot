package org.example.fastapi_to_springboot.controller;

import java.time.LocalDate;

public class BookingController {

        private String clientName;
        private String phone;
        private String email;
        private int roomNumber;
        private String roomDescription;
        private LocalDate bookingDate;

        public BookingController() {}

        public BookingController(String clientName, String phone, String email,
                       int roomNumber, String roomDescription, LocalDate bookingDate) {
            this.clientName = clientName;
            this.phone = phone;
            this.email = email;
            this.roomNumber = roomNumber;
            this.roomDescription = roomDescription;
            this.bookingDate = bookingDate;
        }

        public String getClientName() { return clientName; }
        public String getPhone() { return phone; }
        public String getEmail() { return email; }
        public int getRoomNumber() { return roomNumber; }
        public String getRoomDescription() { return roomDescription; }
        public LocalDate getBookingDate() { return bookingDate; }

        public void setClientName(String clientName) { this.clientName = clientName; }
        public void setPhone(String phone) { this.phone = phone; }
        public void setEmail(String email) { this.email = email; }
        public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }
        public void setRoomDescription(String roomDescription) { this.roomDescription = roomDescription; }
        public void setBookingDate(LocalDate bookingDate) { this.bookingDate = bookingDate; }

}
