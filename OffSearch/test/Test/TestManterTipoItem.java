/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import br.com.offsearch.model.dao.FactoryDAO;
import br.com.offsearch.model.dao.InterfaceDAO;
import br.com.offsearch.model.entity.TipoItem;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Jonatam
 */
public class TestManterTipoItem {

    @Test
    public void TestManterTipoItem() {
        TipoItem ti = new TipoItem();
        ti.setId(null);
        ti.setNome("Camiseta");
        ti.setDescricao("Vestimenta de mangas curtas");
        InterfaceDAO<TipoItem> daoTipoItem = new FactoryDAO().createTipoItemDAO();
                daoTipoItem.salvar(ti);
        Assert.assertEquals(true, ti.getId() != null);
    }
    
}
