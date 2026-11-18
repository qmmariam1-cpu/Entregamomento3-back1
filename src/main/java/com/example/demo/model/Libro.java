package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="libros")
public class Libro {

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;

    @Column(length=100, nullable= false, name="titulo")
    String titulo;
    
      @Column(length=100, nullable= false, name="autor")
    String autor;
    
      @Column(nullable= false, name="paginas")
    int paginas;
    
      @Column(nullable= false, name="precio")
    double precio;
    
      @Column(nullable= false, name="disponible")
    boolean disponible;

    public Libro() {
    }

    public Libro(String titulo, String autor, int paginas, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.precio = precio;
        this.disponible = true;

    }

    public void mostrarInfo() {
        System.out.println("Libro + titulo + autor + paginas + precio + disponible");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
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
