package org.example.diploma_backend_java.service;

import org.example.diploma_backend_java.domain.glamping.Glamping;

public interface GlampingService{
    Glamping createGlamping(Glamping glamping);
    void updateGlamping(Glamping glamping);
    void deleteGlamping(Long id);
    Glamping getGlamping(Long id);
}
