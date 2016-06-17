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

@Controller
public class ControladoProducto {
    @Autowired DAOProducto dao;
    
    
    @RequestMapping("/guardar-producto")
    @ResponseBody String guardarProducto(String nombre, Float precio){
        String mensajito="nada";
        try{
            dao.save(new Producto(nombre, precio));
            mensajito="producto guardado con exito";
        }catch(Exception e){
          mensajito=e.getMessage();
        }
        return mensajito;
    }
    
}
