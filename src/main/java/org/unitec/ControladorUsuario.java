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
public class ControladorUsuario {
    
  //Inyección de dependencias  
  @Autowired
  private UserDao userDao;
  


  @RequestMapping("/guardar")
  @ResponseBody
  public String create(String email, String name) {
    User user = null;
    try {
      user = new User(email, name);
      userDao.save(user);
    }
    catch (Exception ex) {
      return "Error al crear el usuario: " + ex.toString();
    }
    return "Usuario creado con exito (id = " + user.getId() + ")";
  }
  

  @RequestMapping("/borrar")
  @ResponseBody
  public String delete(long id) {
    try {
      User user = new User(id);
      userDao.delete(user);
    }
    catch (Exception ex) {
      return "Error al borrar al usuario: " + ex.toString();
    }
    return "Usuario borrado con exito!";
  }
  
 
  @RequestMapping("/obtener-por-email")
  @ResponseBody
  public String buscarPorEmail(String email) {
    String userId;
    try {
      User user = userDao.findByEmail(email);
      userId = String.valueOf(user.getId());
    }
    catch (Exception ex) {
      return "Usuario no encontrado";
    }
    return "El id del usuario es : " + userId;
  }
  
 
  @RequestMapping("/actualizar")
  @ResponseBody
  public String updateUser(long id, String email, String name) {
    try {
      User user = userDao.findOne(id);
      
      user.setEmail(email);
      user.setName(name);
      userDao.save(user);
    }
    catch (Exception ex) {
      return "Error al actualizar el usuario: " + ex.toString();
    }
    return "Usuario actualizado con exito";
  }


} 