/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.offsearch.model.dao;

import br.com.offsearch.model.entity.Item;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Jonatam
 */
public class ItemDAO implements InterfaceDAO<Item>{
    
    EntityManager em = Conexao.getInstance().createEntityManager();
    @Override
    public void salvar(Item t) {
        try {
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    @Override
    public void atualizar(Item t) {

    }

    @Override
    public List<Item> listar() {
        return null;
    }

    @Override
    public void remover(Item t) {

    }

    @Override
    public Item listarPorId (Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
