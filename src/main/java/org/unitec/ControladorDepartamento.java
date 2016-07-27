/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author campitos
 */
@Controller
public class ControladorDepartamento {
  
    @Autowired DAODepartamento daodep;
    /*
    Creamos el método para guadar un departamento
    */
    
    @CrossOrigin
    @RequestMapping(value="/departamento/{nombre}",method =RequestMethod.GET,
            headers = {"Accept=text/html"})
    @ResponseBody String guardar(@PathVariable String nombre){
        // Geneneramos el objeto de tipo departamento
        Departamento depa=new Departamento(nombre);
        String mensaje="nada";
        try{
        daodep.save(depa);
        mensaje="Departamento guardado con exito!!";
        }catch(Exception e){
            mensaje=e.getMessage();
        }
        return mensaje;
    }
    
      @CrossOrigin
    @RequestMapping(value="/departamento/{nombre}",method =RequestMethod.POST,
            headers = {"Accept=text/html"})
    @ResponseBody String borrar(@PathVariable String nombre){
        // Geneneramos el objeto de tipo departamento
        Departamento depa=new Departamento(nombre);
        String mensaje="nada";
        try{
        daodep.save(depa);
        mensaje="Departamento guardado con exito!!";
        }catch(Exception e){
            mensaje=e.getMessage();
        }
        return mensaje;
    }
    
    
    
}
