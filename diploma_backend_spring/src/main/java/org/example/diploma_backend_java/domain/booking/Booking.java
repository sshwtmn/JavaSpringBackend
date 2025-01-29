package org.example.diploma_backend_java.domain.booking;

import jakarta.persistence.*;
import lombok.Data;
import org.example.diploma_backend_java.domain.glamping.Glamping;
import org.example.diploma_backend_java.domain.user.User;

import java.util.Date;

@Data
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private User user;
    @Column(nullable = false)
    private Date dateFrom;
    @Column(nullable = false)
    private Date dateTo;
    private double finalCost;
    @ManyToOne
    private Glamping glamping;

}
