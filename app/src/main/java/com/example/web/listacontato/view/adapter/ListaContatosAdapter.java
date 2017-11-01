package com.example.web.listacontato.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.web.listacontato.model.bean.Contatos;
import com.example.web.listacontato.model.dao.ContatosDAO;

import java.util.List;

/**
 * Created by Web on 01/11/2017.
 */

public class ListaContatosAdapter extends BaseAdapter {


    private List<Contatos> lista;
    private LayoutInflater layout;

    public ListaContatosAdapter(){

        lista = ContatosDAO.manager.all();
    }

    public ListaContatosAdapter(Context context){
        lista = ContatosDAO.manager.all();
        layout = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
