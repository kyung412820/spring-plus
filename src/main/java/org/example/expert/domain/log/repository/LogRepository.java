package org.example.expert.domain.log.repository;

import jakarta.transaction.Transactional;
import org.example.expert.domain.log.entity.Log;
import org.example.expert.domain.manager.entity.Manager;
import org.example.expert.domain.manager.repository.ManagerRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import java.time.LocalDateTime;

public interface LogRepository extends JpaRepository<Log, Long> {
}


