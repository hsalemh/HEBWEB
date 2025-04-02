package fr.hebweb.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VpsOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int cpu;
    private int ram; // En Go
    private int storage; // En Go
    private double price; // En €

    public VpsOffer() {}

    public VpsOffer(String name, int cpu, int ram, int storage, double price) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getCpu() { return cpu; }
    public void setCpu(int cpu) { this.cpu = cpu; }
    public int getRam() { return ram; }
    public void setRam(int ram) { this.ram = ram; }
    public int getStorage() { return storage; }
    public void setStorage(int storage) { this.storage = storage; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price=price;}
}