package com.ferm.FaceRecognition;

import com.google.firebase.database.IgnoreExtraProperties;

import java.time.Instant;
import java.util.Date;

@IgnoreExtraProperties
public class Kid {

    public String voornaam;
    public String naam;
    public Date timestamp;

    public Kid() {

    }

    public Kid(String voornaam, String naam) {
        this.voornaam = voornaam;
        this.naam = naam;
        this.timestamp = Date.from(Instant.now());
    }
}
