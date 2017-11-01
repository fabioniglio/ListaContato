package com.example.web.listacontato.model.dao;

import android.app.ListActivity;

import com.example.web.listacontato.model.bean.Contatos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Web on 31/10/2017.
 * Controle dos dados DAO
 */

public class ContatosDAO {

    public static ContatosDAO manager = new ContatosDAO();
    private List<Contatos> lista;
    private int id=0;

    public List<Contatos> all(){ return lista;}

    //Construtor
    private ContatosDAO(){
        lista = new ArrayList<>();
    }

    public int size(){ return lista.size();}

    public void add(Contatos obj) throws DaoException {

        Contatos pesquisa = null;
        for(Contatos item : lista){

            if(item.getNome().equals(obj.getNome())){

                pesquisa = item;
                break;
            }
        }

        if(pesquisa !=null){
            throw  new DaoException("Contatos duplicados para o nome: " + obj.getNome());

        }

        //incremento
        id++;

        obj.setId(id);
        lista.add(obj);

    }

    public Contatos get(int id) throws DaoException {
        Contatos pesquisa = null;
        for(Contatos item : lista){
            if(item.getId()== id) {
                pesquisa = item;
                break;

            }

        }

        if(pesquisa != null){
            throw  new DaoException("Contato não encontrado para o id: " + id);

        }
        return pesquisa;

    }

}
