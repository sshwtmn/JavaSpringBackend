package org.example.diploma_backend_java.service;

import org.example.diploma_backend_java.domain.booking.Booking;
import org.example.diploma_backend_java.domain.user.User;

public interface BookingService {
    Booking createBooking(Booking booking);
    Booking getBookingByUserId(String userId);
    void updateBooking(Booking booking);
    void deleteBooking(Booking booking);
    void createBooking(Booking booking, User user);
}
