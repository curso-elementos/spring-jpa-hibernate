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
public class ControladorEmpleado {
    @Autowired DAODepartamento daodep;
    @Autowired DAOEmpleado daoemp;
    
    
    @CrossOrigin
    @RequestMapping(value="/empleado/{id_departamento}/{nombre}",
            method=RequestMethod.POST,
            headers={"Accept=text/html"})
    @ResponseBody String guardar(@PathVariable Long id_departamento,
            @PathVariable String nombre)throws Exception{
        //Tenemos que buscar el departamanto al
        //que vamos a asignar al nuevo
    //Empleaado
    Departamento dep=daodep.findOne(id_departamento);
   Empleado x=new Empleado(dep,nombre );
    daoemp.save(x);
       return "Empleado guardado con exitooooo!!"; 
    }
    
}
