package com.app.web.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre",nullable = false,length = 50)
    private String nombre;

    @Column(name = "apellido",nullable = false,length = 50)
    private String apellido;

    @Column(name = "email",nullable = false,length = 50,unique = true)
    private String email;

    @Column(name = "notes")
    private String notes;

    public Estudiante() {

    }

    public Estudiante(Long id, String nombre, String apellido, String email, String notes) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.notes = notes;
    }

    public Estudiante(String nombre, String apellido, String email, String notes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + "]";
    }
}
