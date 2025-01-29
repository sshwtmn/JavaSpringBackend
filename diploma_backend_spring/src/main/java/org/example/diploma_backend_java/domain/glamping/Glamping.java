package org.example.diploma_backend_java.domain.glamping;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.diploma_backend_java.domain.booking.Booking;

import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Glamping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false, unique = true)
    private String address;

    private boolean available = true;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Booking> bookings;

    //Нужен список фотографий обьекта
}