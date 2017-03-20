package com.brsvc.zaq;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by student on 20.03.2017.
 */

public class Scena4 extends AppCompatActivity {


    private ListView Lista;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scena4);


        Lista = (ListView) findViewById(R.id.lista);
        RowLista RowList_data[] = new RowLista[] {

                new RowLista(R.drawable.adam, "Mercedes"),
                new RowLista(R.drawable.adam, "Volkswagen"),
                new RowLista(R.drawable.adam, "BMW"),
                new RowLista(R.drawable.adam, "Aston Martin"),
                new RowLista(R.drawable.adam, "Mercedes"),
                new RowLista(R.drawable.adam, "Volkswagen"),
                new RowLista(R.drawable.adam, "BMW"),
                new RowLista(R.drawable.adam, "Aston Martin"),
                new RowLista(R.drawable.adam, "Mercedes"),
                new RowLista(R.drawable.adam, "Volkswagen"),
                new RowLista(R.drawable.adam, "BMW"),
                new RowLista(R.drawable.adam, "Aston Martin"),
                new RowLista(R.drawable.adam, "Mercedes"),
                new RowLista(R.drawable.adam, "Volkswagen"),
                new RowLista(R.drawable.adam, "BMW"),
                new RowLista(R.drawable.adam, "Aston Martin")
        };

        RowAdapter adapter = new RowAdapter(this,
                R.layout.mainlayout, RowList_data);


        Lista.setAdapter(adapter);


    }
}
