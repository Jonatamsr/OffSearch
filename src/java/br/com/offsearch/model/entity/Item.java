/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.offsearch.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jonatam
 */

@Entity
@Table(name = "ITEM")
@XmlRootElement
public class Item {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Long codBarras;
    @ManyToOne
    private TipoItem tipoItem;
    @ManyToOne
    private Fabricante fabricante;
    @ManyToOne
    private ListaDesejos desejos;

    public ListaDesejos getDesejos() {
        return desejos;
    }

    public void setDesejos(ListaDesejos desejos) {
        this.desejos = desejos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(Long codBarras) {
        this.codBarras = codBarras;
    }

    public TipoItem getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(TipoItem tipoItem) {
        this.tipoItem = tipoItem;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "\nNome: " + this.nome + "\nTipo: " + this.tipoItem + "\nFabricante: "
                + this.fabricante + "\nCódigo de Barras: " + this.codBarras + "\n";
    }
        
}
