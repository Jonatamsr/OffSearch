/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import br.com.offsearch.model.dao.FactoryDAO;
import br.com.offsearch.model.dao.InterfaceDAO;
import br.com.offsearch.model.entity.Fabricante;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Jonatam
 */
public class TestManterFabricante {

    @Test
    public void TestManterFabricante() {
        Fabricante f = new Fabricante();
        f.setId(null);
        f.setNome("Lacoste");
        f.setDescricao("Empresa de Camisas Finas");
        InterfaceDAO<Fabricante> daoFabricante = new FactoryDAO().createFabricanteDAO();
                daoFabricante.salvar(f);
        Assert.assertEquals(true, f.getId() != null);
    }
    
}
