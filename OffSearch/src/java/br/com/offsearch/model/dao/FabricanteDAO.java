/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.offsearch.model.dao;

import br.com.offsearch.model.entity.Fabricante;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Jonatam
 */
public class FabricanteDAO implements InterfaceDAO<Fabricante>{
    
    EntityManager em = Conexao.getInstance().createEntityManager();
    @Override
    public void salvar(Fabricante t) {
        try {
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            em.flush();
            em.close();
        }
    }
    

    public Fabricante listarPorId (int id){
        Fabricante f = null;
        try {
            em.getTransaction().begin();
            String queryString = "from fabricante where id = :id";
            Query query = em.createQuery(queryString);
            query.setParameter("id", id);
            f = (Fabricante) query.getSingleResult();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            em.flush();
            em.close();
        }
        return f;
    }

    @Override
    public void atualizar(Fabricante t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fabricante> listar() {
        List<Fabricante> fabricantes = new ArrayList<Fabricante>();
        try{
            em.getTransaction().begin();    
            fabricantes = em.createQuery("from Fabricante").getResultList();
        }
        catch (RuntimeException e){
            e.printStackTrace();
        }finally{
            em.flush();
            em.close();
        }
        return fabricantes;
    }

    @Override
    public void remover(Fabricante t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
