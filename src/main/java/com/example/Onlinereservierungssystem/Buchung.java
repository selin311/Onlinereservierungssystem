package com.example.Onlinereservierungssystem;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Buchung {
    @Id
    @SequenceGenerator(
            name = "buchung_sequence",
            sequenceName = "buchung_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "buchung_sequence"
    )
    private Long id;
    private String username;
    private String date;
    private String starttime;
    private String endtime;
    private String reason;
    private Boolean allDay;

}
