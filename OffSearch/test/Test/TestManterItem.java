/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import br.com.offsearch.model.dao.FabricanteDAO;
import br.com.offsearch.model.dao.FactoryDAO;
import br.com.offsearch.model.dao.InterfaceDAO;
import br.com.offsearch.model.dao.TipoItemDAO;
import br.com.offsearch.model.entity.Fabricante;
import br.com.offsearch.model.entity.Item;
import br.com.offsearch.model.entity.TipoItem;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Jonatam
 */
public class TestManterItem {

    @Test
    public void TestManterItem() {
        Item i = new Item();
        i.setId(null);
        i.setNome("Camiseta");
        InterfaceDAO<Fabricante> fabr = new FabricanteDAO();
        Fabricante f1 = fabr.listarPorId(1l);
        i.setFabricante(f1);
        i.setCodBarras(123l);
        InterfaceDAO<TipoItem> tipoI = new TipoItemDAO();
        i.setTipoItem(tipoI.listarPorId(1l));
        InterfaceDAO<Item> daoItem = new FactoryDAO().createItemDAO();
                daoItem.salvar(i);
        Assert.assertEquals(true, i.getId() != null);
    }
    
}
