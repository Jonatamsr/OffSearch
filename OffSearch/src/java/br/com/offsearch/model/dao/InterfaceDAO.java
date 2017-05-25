/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.offsearch.model.dao;

import java.util.List;

/**
 *
 * @author Jonatam
 * @param <T>
 */
public interface InterfaceDAO<T> {
    
        public void salvar(T t);
	public void atualizar(T t);
	public List<T> listar();
	public void remover(T t);
    
}
