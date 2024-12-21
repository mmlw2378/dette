package com.dette.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Session {
    private int id;
    private LocalDateTime date;
    private LocalDateTime heureDebut;
    private LocalDateTime heureFin;
    private String salle; // Peut être null pour un cours en ligne
    private Cours cours;

    // Constructeurs, getters et setters
    public Session(int id, LocalDateTime date, LocalDateTime heureDebut, LocalDateTime heureFin, String salle, Cours cours) {
        this.id = id;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.salle = salle;
        this.cours = cours;
    }

    public Session(LocalDate date2, LocalTime heureDebut2, LocalTime heureFin2, String salle2) {
        //TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(LocalDateTime heureDebut) {
        this.heureDebut = heureDebut;
    }

    public LocalDateTime getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(LocalDateTime heureFin) {
        this.heureFin = heureFin;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    @Override
    public String toString() {
        return "Session{id=" + id + ", date=" + date + ", heureDebut=" + heureDebut +
                ", heureFin=" + heureFin + ", salle='" + salle + "', cours=" + cours + "}";
    }
}
