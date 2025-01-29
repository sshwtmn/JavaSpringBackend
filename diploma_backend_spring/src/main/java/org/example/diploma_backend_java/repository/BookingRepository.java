package org.example.diploma_backend_java.repository;

import org.example.diploma_backend_java.domain.booking.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository {
    Optional<Booking> findBookingByUserId(Long userId);
    void createBooking(Booking booking);
    void deleteBooking(Booking booking);
    void updateBooking(Booking booking);

}
