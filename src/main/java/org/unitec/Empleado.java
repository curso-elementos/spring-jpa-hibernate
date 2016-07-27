/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author campitos
 */
@Entity
@Table(name="empleado_x")
public class Empleado {
    
    @Id
    @GeneratedValue
    Long id;
    
    @ManyToOne
    @JoinColumn(name="id_departamento")        
    Departamento depa;
    
    String nombre;

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", depa=" + depa + ", nombre=" + nombre + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Departamento getDepa() {
        return depa;
    }

    public void setDepa(Departamento depa) {
        this.depa = depa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(Departamento depa, String nombre) {
        this.depa = depa;
        this.nombre = nombre;
    }

    public Empleado() {
    }
    
}
