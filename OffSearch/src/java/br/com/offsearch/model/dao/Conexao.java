/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.offsearch.model.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jonatam
 */
public class Conexao {
    
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("OffSearch");
    
    public static EntityManagerFactory getInstance(){
        return emf;
    }
    
}
