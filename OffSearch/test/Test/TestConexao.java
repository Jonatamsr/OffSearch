/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jonatam
 */
public class TestConexao {
    
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
    
    public static EntityManagerFactory getInstance(){
        return emf;
    }
    
}
