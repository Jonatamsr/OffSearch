/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.offsearch.model.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.spi.PersistenceProvider;
import org.hibernate.jpa.HibernatePersistenceProvider;

/**
 *
 * @author Jonatam
 */
public class Conexao {
    
    
    static final PersistenceProvider provider = new HibernatePersistenceProvider();
    static EntityManagerFactory emf = provider.createEntityManagerFactory("offsearch", null);
    
    public static EntityManagerFactory getInstance(){
        return emf;
    }
}
