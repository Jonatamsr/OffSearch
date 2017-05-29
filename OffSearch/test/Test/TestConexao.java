/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import org.hibernate.jpa.HibernatePersistenceProvider;

/**
 *
 * @author Jonatam
 */
public class TestConexao {

    public void TestConexao() {
    PersistenceProvider provider = new HibernatePersistenceProvider();
    EntityManagerFactory emf = provider.createEntityManagerFactory("test", null);
    
   
    }
}
