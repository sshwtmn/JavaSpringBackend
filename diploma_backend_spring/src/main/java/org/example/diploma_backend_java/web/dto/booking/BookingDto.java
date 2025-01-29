package org.example.diploma_backend_java.web.dto.booking;

import lombok.Data;
import org.example.diploma_backend_java.domain.glamping.Glamping;
import org.example.diploma_backend_java.domain.user.User;

import java.util.Date;
@Data
public class BookingDto {
    private Long id;
    private User user;
    private Date dateFrom;
    private Date dateTo;
    private double finalCost;
    private Glamping glamping;
}
