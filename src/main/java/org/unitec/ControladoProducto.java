/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    
    @RequestMapping("/actualizar-producto")
    @ResponseBody String actualizar(Long id, String nombre, 
            Float precio){
        String mensajito="nada";
        try{
         Producto p=     dao.findOne(id);
            p.setNombre(nombre);
            p.setPrecio(precio);
            dao.save(p);
            mensajito="Producto actualziado con exito";
        }catch(Exception e){
           mensajito=e.getMessage();
        }
        return mensajito;
    }
    
    @RequestMapping("/buscarproducto-porid")
    @ResponseBody String bucarPorId(Long id){
        String mensajito="nada";
        try{
       Producto p=      dao.findOne(id);
       mensajito=p.toString();
        }catch(Exception e){
            mensajito=e.getMessage();
        }
        return mensajito;
    }
    
    @CrossOrigin
    @RequestMapping(value="/producto", method=RequestMethod.GET, headers={"Accept=application/json"})
    @ResponseBody String buscarTodos()throws Exception{
        String mensajito="nada";
     ArrayList<Producto> productos=     (ArrayList<Producto>) dao.findAll();
      //Usamos del paquete fasterxml de jackson la clase ObjectMapper
      ObjectMapper maper=new ObjectMapper();
      return maper.writeValueAsString(productos);
    }
    
    @RequestMapping("/borrar-producto")
    @ResponseBody String borrarProducto(Long id){
        String mensajito="nada";
        try{
               dao.delete(id);
               mensajito="SE borro tu registro con exito";
            
        }catch(Exception e){
            mensajito=e.getMessage();
        }
        return mensajito;
    }
    
    @RequestMapping("/buscar-pornombre")
    @ResponseBody String buscarPorNombre(String nombre){
        String mensajito="nada";
        StringBuilder builder=new StringBuilder();
        try{
        for(Producto p:dao.findByNombre(nombre)){
            builder.append("<br>"+p.toString());
          }
        mensajito=builder.toString();
        }catch(Exception e){
            mensajito=e.getMessage();
        }
        return mensajito;
    }
    
    
    
    
    
    
    
    
    
    
    
}
