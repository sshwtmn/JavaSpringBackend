package org.example.diploma_backend_java.service.impl;

import org.example.diploma_backend_java.domain.booking.Booking;
import org.example.diploma_backend_java.domain.user.User;
import org.example.diploma_backend_java.service.BookingService;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {
    @Override
    public Booking createBooking(Booking booking) {
        return null;
    }

    @Override
    public Booking getBookingByUserId(String userId) {
        return null;
    }

    @Override
    public void updateBooking(Booking booking) {

    }

    @Override
    public void deleteBooking(Booking booking) {

    }

    @Override
    public void createBooking(Booking booking, User user) {

    }
}
