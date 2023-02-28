package com.example.Onlinereservierungssystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuchungRepository extends JpaRepository<Buchung, Long> {

    @Query("SELECT DISTINCT username FROM Buchung")
    List<String> findDistinctUsernames();
}
