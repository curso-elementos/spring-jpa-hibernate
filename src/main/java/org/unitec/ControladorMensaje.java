/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

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
        dao.save(new Mensaje(titulo, cuerpo));
        
        return "Mensaje guardado con exito";
    }
}
