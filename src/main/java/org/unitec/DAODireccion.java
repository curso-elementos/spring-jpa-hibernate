/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author rapid
 */
@Transactional
public interface DAODireccion extends CrudRepository<Direccion, Long>{
    
}
