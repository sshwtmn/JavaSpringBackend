package org.example.diploma_backend_java.repository.impl;

import org.example.diploma_backend_java.domain.booking.Booking;
import org.example.diploma_backend_java.repository.BookingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BookingRepositoryImpl implements BookingRepository {
    @Override
    public Optional<Booking> findBookingById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Booking> findBookingByUserId(Long userId) {
        return Optional.empty();
    }

    @Override
    public void createBooking(Booking booking) {

    }

    @Override
    public void deleteBooking(Booking booking) {

    }

    @Override
    public void updateBooking(Booking booking) {

    }
}
