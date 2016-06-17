/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author rapid
 */
@Controller
public class ControladorMensaje {
    
    @Autowired 
    DAOMensaje dao;
    
    @RequestMapping(value="/mensaje")
    @ResponseBody String guardar(String titulo, String cuerpo){
    Mensaje mensaje= null;
    try {
      mensaje = new Mensaje(titulo, cuerpo);
      dao.save(mensaje);
    }
    catch (Exception ex) {
      return "Error al crear el usuario: " + ex.toString();
    }
    return "Usuario creado con exito (id = " + mensaje.getId() + ")";
    }
    
    @RequestMapping("/mensaje-por-titulo")
    @ResponseBody String buscrPorTitulo(String titulo){
         String id;
          List<Mensaje> mensajes=null;
    try {
        String valor="Nada";
    mensajes = dao.findByTitulo(titulo);
      id = String.valueOf(mensajes.get(0).getId());
    }
    catch (Exception ex) {
      return "Usuario no encontradodsd";
    }
    return "El id del primer mensaje es : " + id +" y son "+mensajes.size()+" encontrados";
    }
}
