package com.youthhomelessnessproject.academicsuccess.services;

import com.youthhomelessnessproject.academicsuccess.models.Session;
import com.youthhomelessnessproject.academicsuccess.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessionServiceImpl implements SessionService {

    // Runtime constructor-based injection of SessionRepository dependency
    private final SessionRepository sessionRepository;

    @Autowired
    public SessionServiceImpl(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @Override
    public List<Session> getAllSessions() {
        return sessionRepository.findAll();
    }

    @Override
    public Session saveSession(Session session) {
        return sessionRepository.save(session);
    }

    @Override
    public Optional<Session> findSessionById(Long id) {
        return sessionRepository.findById(id);
    }
}
