package com.example.Onlinereservierungssystem;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/buchung")
@RequiredArgsConstructor
public class BuchungController {

    private final BuchungService buchungService;

    @GetMapping
    public List<Buchung> getAllBuchungen() {
        return this.buchungService.getAllBuchungen();
    }

    @GetMapping("/allUsernames")
    public List<String> getAllUsernames() {
        return this.buchungService.getAllUsernames();
    }

    @PostMapping
    public Buchung saveBuchung(@RequestBody Buchung buchung) {
        return this.buchungService.saveBuchung(buchung);
    }

    @PutMapping ("/update")
    public Buchung updateBuchung(@RequestBody Buchung buchung) {
        return this.buchungService.updateBuchung(buchung);
    }

    @DeleteMapping("/{buchungId}")
    public void deleteBuchung(@PathVariable Long buchungId) {
        this.buchungService.deleteBuchung(buchungId);
    }
}
