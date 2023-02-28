package com.example.Onlinereservierungssystem.Initialization;

import com.example.Onlinereservierungssystem.Buchung;
import com.example.Onlinereservierungssystem.BuchungRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements ApplicationRunner {

    @Autowired
    private BuchungRepository buchungRepository;


    public void run(ApplicationArguments args) {
        buchungRepository.save(new Buchung(1L,"Nadine","2023-02-07","14:00","16:00", "Klausurvorbereitung", false));
        buchungRepository.save(new Buchung(2L,"Marco","2023-02-16","13:00","16:00", "Besprechung", false));
        buchungRepository.save(new Buchung(3L,"Selin","2023-02-20","18:00","19:00", "Ruhezeit", false));
        buchungRepository.save(new Buchung(4L,"Anna","2023-02-24","14:00","16:00", "Besprechung", false));
        buchungRepository.save(new Buchung(5L,"Marco","2023-02-28","00:00","23:59", "Klausurkorrektur", true));
    }
}