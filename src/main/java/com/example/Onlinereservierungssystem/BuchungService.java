package com.example.Onlinereservierungssystem;

import java.util.List;

public interface BuchungService {
    List<Buchung> getAllBuchungen();

    Buchung saveBuchung(Buchung buchung);

    Buchung updateBuchung(Buchung buchung);

    void deleteBuchung(Long buchungId);

    List<String> getAllUsernames();
}
