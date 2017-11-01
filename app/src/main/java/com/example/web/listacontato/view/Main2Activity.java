package com.example.web.listacontato.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.web.listacontato.R;

public class Main2Activity extends AppCompatActivity {

    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = (ListView) findViewById(R.id.listaContato);


    }

    public void onContatosClick(View view){
        Intent it = new Intent(getBaseContext(), Activity_contato.class);
        startActivity(it);

    }
}
