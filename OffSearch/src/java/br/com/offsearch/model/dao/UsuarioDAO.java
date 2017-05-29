/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.offsearch.model.dao;

import br.com.offsearch.model.entity.Usuario;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Jonatam
 */
public class UsuarioDAO implements InterfaceDAO<Usuario>{

    @Override
    public void salvar(Usuario t) {
        EntityManager em = Conexao.
				getInstance().createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(t);
		
		em.getTransaction().commit();
    }

    @Override
    public void atualizar(Usuario t) {
       
    }

    @Override
    public List<Usuario> listar() {
        return null;
    }

    @Override
    public void remover(Usuario t) {
        
    }
    
}
