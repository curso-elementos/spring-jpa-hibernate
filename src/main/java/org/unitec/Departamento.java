/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author campitos
 */
@Entity
@Table(name="departamento")
public class Departamento {
    
    @Id
    @GeneratedValue
    Long id;
    
    String nombre;

    @Override
    public String toString() {
        return "Departamento{" + "id=" + id + ", nombre=" + nombre + '}';
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

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public Departamento() {
    }
    
}
