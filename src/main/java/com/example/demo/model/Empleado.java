package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="empleados")
public class Empleado {

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;

    @Column(length=100, nullable=false, name="nombre")
    String nombre;
    
    @Column(length=100, nullable=false, name="cargo")
    String cargo;
    
    @Column(nullable=false, name="salario")
    double salario;
    

    public Empleado(int id, String nombre, String cargo, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }



    public Empleado() {
    }


    
    public void mostrarInfo() {
        System.out.println("Empleado + nombre + cargo + salario");
    }

public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}