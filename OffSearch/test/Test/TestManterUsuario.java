package Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.offsearch.model.dao.FactoryDAO;
import br.com.offsearch.model.dao.InterfaceDAO;
import br.com.offsearch.model.entity.Usuario;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Jonatam
 */
public class TestManterUsuario {
    
    @Test
    public void TestManterUsuario(){
        
        Usuario u = new Usuario();
        u.setId(null);
        u.setUsername("Paulo Gomes");
        u.setPassword("123");
                
        InterfaceDAO<Usuario> usuarioDao = FactoryDAO.createUsuarioDAO();
		usuarioDao.salvar(u);
        
        Assert.assertEquals(true, u.getId() != null);
       
    }
    
}
