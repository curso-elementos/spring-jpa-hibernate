/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;


import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

/**
Estos métodos automaticamente aparecen con el repositorio de HIbernate( CrudRepository<User, Long>)
 los métodos disponibles  de dicha interface son
 *  save, delete, deleteAll, findOne and findAll.
 */
@Transactional
public interface UserDao extends CrudRepository<User, Long> {

  /**
   * Aqui se pueden personalizar los que quieras además de los anteriores
   */
  public User findByEmail(String email);

} // class UserDao