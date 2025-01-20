package org.example.expert.domain.log.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "log")
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String action;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @Column(nullable = true)
    private String details;

    public Log() {
    }

    public Log(String action, LocalDateTime timestamp, String details) {
        this.action = action;
        this.timestamp = timestamp;
        this.details = details;
    }

    // Getters and Setters
}