package com.example.Onlinereservierungssystem;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BuchungServiceImplementation implements BuchungService {

    private final BuchungRepository buchungRepository;

    @Override
    public List<Buchung> getAllBuchungen() {
        return this.buchungRepository.findAll();
    }

    @Override
    public Buchung saveBuchung(Buchung buchung) {
        return this.buchungRepository.save(buchung);
    }

    @Override
    public Buchung updateBuchung(Buchung buchung) {
        Optional<Buchung> buchungById =  this.buchungRepository.findById(buchung.getId());
        if (buchungById != null) {
            Buchung buchungToUpdate = buchungById.get();
            buchungToUpdate.setUsername(buchung.getUsername());
            buchungToUpdate.setReason(buchung.getReason());
            buchungToUpdate.setStarttime(buchung.getStarttime());
            buchungToUpdate.setEndtime(buchung.getEndtime());
            buchungToUpdate.setAllDay(buchung.getAllDay());
            this.buchungRepository.save(buchungToUpdate);
        }
        return buchung;
    }

    @Override
    public void deleteBuchung(Long buchungId) {
        this.buchungRepository.deleteById(buchungId);
    }

    @Override
    public List<String> getAllUsernames() {
        return  this.buchungRepository.findDistinctUsernames();
    }

}
