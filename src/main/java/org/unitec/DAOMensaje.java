/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author rapid Para  ver la documentación de esta API consulta la version oficial de spring.io es la siguiente
 * 
 */
@Transactional
public interface DAOMensaje extends CrudRepository<Mensaje,Long> {
    public List<Mensaje> findByTitulo(String titulo);
}
