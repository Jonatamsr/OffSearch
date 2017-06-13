/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.offsearch.model.dao;

import br.com.offsearch.model.entity.TipoItem;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Jonatam
 */
public class TipoItemDAO implements InterfaceDAO<TipoItem>{
    
    EntityManager em = Conexao.getInstance().createEntityManager();
    
    @Override
    public void salvar(TipoItem t) {
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    }

    @Override
    public void atualizar(TipoItem t) {
        
    }

    @Override
    public List<TipoItem> listar() {
        return null;
    }

    @Override
    public void remover(TipoItem t) {
        
    }

    @Override
    public TipoItem listarPorId(Long id) {
        TipoItem ti = null;
        try {
            em.getTransaction().begin();
            ti = em.find(TipoItem.class, id);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return ti;
    }
    
}
