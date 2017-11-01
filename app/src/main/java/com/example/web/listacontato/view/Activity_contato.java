package com.example.web.listacontato.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.web.listacontato.R;
import com.example.web.listacontato.model.bean.Contatos;
import com.example.web.listacontato.model.dao.ContatosDAO;
import com.example.web.listacontato.model.dao.DaoException;

public class Activity_contato extends AppCompatActivity {




    EditText txtNome, txtEmail, txtTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        txtNome = (EditText) findViewById(R.id.txtName);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtTelefone = (EditText) findViewById(R.id.txtTelefone);

        try {
            Contatos contatos = ContatosDAO.manager.get(1);
            txtNome.setText(contatos.getNome());
            txtEmail.setText(contatos.getEmail());
            txtTelefone.setText(contatos.getTelefone());

        } catch (DaoException e) {
            error(e.getMessage());
        }


    }


    public void onSaveClick(View view){

        //pega os dados digitados

        String nome = txtNome.getEditableText().toString();
        String email = txtEmail.getEditableText().toString();
        String telefone = txtTelefone.getEditableText().toString();

        Contatos contatos = new Contatos();
        contatos.setNome(nome);
        contatos.setEmail(email);
        contatos.setTelefone(telefone);

        try {
            ContatosDAO.manager.add(contatos);
        } catch (DaoException e) {
            error(e.getMessage());
        }

        finish();
    }

    private void error(String msg){

        Toast.makeText(getBaseContext(),msg,Toast.LENGTH_LONG);
    }


}
