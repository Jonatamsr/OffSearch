/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.offsearch.rest;

import br.com.offsearch.model.dao.ItemDAO;
import br.com.offsearch.model.entity.Item;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author E0061868
 */

@Path("/itemrest")
public class ItemRest {
    
        @POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(Item item) {
            new ItemDAO().salvar(item);       
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Item> listar() {
		List<Item> listaItens = new ItemDAO().listar();
		return listaItens;
	}
}
