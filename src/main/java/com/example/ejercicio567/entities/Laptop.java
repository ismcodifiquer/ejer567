package com.example.ejercicio567.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "laptops")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fabricante;
    private String model;
    private Integer RAM;
    private Integer discoDuro;
    private LocalDate fabYear;
    private Boolean online;

    public Laptop() {
    }

    public Laptop(Long id, String fabricante, String model, Integer RAM, Integer discoDuro, LocalDate fabYear, Boolean online) {
        this.id = id;
        this.fabricante = fabricante;
        this.model = model;
        this.RAM = RAM;
        this.discoDuro = discoDuro;
        this.fabYear = fabYear;
        this.online = online;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(Integer discoDuro) {
        this.discoDuro = discoDuro;
    }

    public LocalDate getFabYear() {
        return fabYear;
    }

    public void setFabYear(LocalDate fabYear) {
        this.fabYear = fabYear;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }
}
