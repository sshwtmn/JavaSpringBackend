package org.example.diploma_backend_java.repository;

import org.example.diploma_backend_java.domain.glamping.Glamping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GlampingRepository {
    Optional<Glamping> findGlampingById(Long id);
    void createGlamping(Glamping glamping);
    void updateGlamping(Glamping glamping);
    void deleteGlamping(Long id);
}
