/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author rapid
 */
@Entity
@Table(name="direccion")
public class Direccion {
    @Id
    @GeneratedValue
    Long id_direccion;

    public Long getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(Long id_direccion) {
        this.id_direccion = id_direccion;
    }

    String municipio;

  @OneToOne
  Persona persona;

    public Direccion(String municipio, Persona persona) {
        this.municipio = municipio;
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Direccion(String municipio) {
        this.municipio = municipio;
    }

    public Direccion() {
    }
    
}
