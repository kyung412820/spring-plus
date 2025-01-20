package org.example.expert.domain.todo.repository;

import org.example.expert.domain.todo.entity.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface TodoRepository extends JpaRepository<Todo, Long> {

    @Query("SELECT t FROM Todo t LEFT JOIN FETCH t.user u WHERE t.id = :todoId")
    Optional<Todo> findByIdWithUser(@Param("todoId") Long todoId);

    @Query("SELECT t FROM Todo t LEFT JOIN FETCH t.user u ORDER BY t.modifiedAt DESC")
    Page<Todo> findAllByOrderByModifiedAtDesc(Pageable pageable);

    @Query("SELECT t FROM Todo t WHERE t.weather = :weather AND t.modifiedAt BETWEEN :startDate AND :endDate")
    Page<Todo> findByWeatherAndModifiedAtBetween(
            @Param("weather") String weather,
            @Param("startDate") String startDate,
            @Param("endDate") String endDate,
            Pageable pageable);

    @Query("SELECT t FROM Todo t WHERE t.weather = :weather")
    Page<Todo> findByWeather(
            @Param("weather") String weather,
            Pageable pageable);

    @Query("SELECT t FROM Todo t WHERE t.modifiedAt BETWEEN :startDate AND :endDate")
    Page<Todo> findByModifiedAtBetween(
            @Param("startDate") String startDate,
            @Param("endDate") String endDate,
            Pageable pageable);
}
