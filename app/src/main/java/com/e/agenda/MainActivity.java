package com.e.agenda;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //cria lista para termos dados pra manipular
        List<String> alunos = new ArrayList<>(Arrays.asList("Alex Felipe", "Lívia", "Fabricio", "Milaide", "Ju"));

        //pega o id da lista no layout
        ListView listaDeAlunos = findViewById(R.id.activity_main_lista_de_alunos);

        //seta o adapter - que vincula os dados com o layout
        listaDeAlunos.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                alunos));


    }


}