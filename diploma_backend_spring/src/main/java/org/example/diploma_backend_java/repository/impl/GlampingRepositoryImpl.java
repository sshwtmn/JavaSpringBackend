package org.example.diploma_backend_java.repository.impl;

import org.example.diploma_backend_java.domain.glamping.Glamping;
import org.example.diploma_backend_java.repository.GlampingRepository;

import java.util.Optional;

public class GlampingRepositoryImpl implements GlampingRepository {
    @Override
    public Optional<Glamping> findGlampingById(Long id) {
        return Optional.empty();
    }

    @Override
    public void createGlamping(Glamping glamping) {

    }

    @Override
    public void updateGlamping(Glamping glamping) {

    }

    @Override
    public void deleteGlamping(Long id) {

    }
}
