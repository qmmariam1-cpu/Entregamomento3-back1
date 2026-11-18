package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="revistas")
public class Revista {

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;

    @Column(length=100, nullable=false, name="titulo")
    String titulo; 
    
    @Column(nullable=false, name="numero_edicion")
    int numeroEdicion;
    
    @Column(length=50, nullable=false, name="editorial")
    String editorial;
    
    @Column(nullable=false, name="precio")
    double precio;
    
    @Column(nullable=false, name="disponible")
    boolean disponible;

    public Revista() {
    }

    public Revista(String titulo, int numeroEdicion, String editorial, double precio) {
        this.titulo = titulo;
        this.numeroEdicion = numeroEdicion;
        this.editorial = editorial;
        this.precio = precio;
        this.disponible = true;
    }

     public void mostrarInfo() {
        System.out.println("Revista + titulo + numeroEdicion + editorial + precio + disponible");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

      public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }
    
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

    














