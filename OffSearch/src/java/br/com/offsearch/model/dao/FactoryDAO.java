/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.offsearch.model.dao;

import br.com.offsearch.model.entity.Usuario;

/**
 *
 * @author Jonatam
 */
public class FactoryDAO {
    
    public static InterfaceDAO<Usuario> createUsuarioDAO() {
		return new UsuarioDAO();
	}
    
}
