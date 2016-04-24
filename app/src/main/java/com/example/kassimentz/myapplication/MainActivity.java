package com.example.kassimentz.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.kassimentz.myapplication.model.Produto;
import com.example.kassimentz.myapplication.model.Venda;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Venda v = new Venda();
        v.addProduto(new Produto("cadeira", 30));
        v.addProduto(new Produto("mesa", 120));
        v.addProduto(new Produto("copos", 10));
        try {
            v.setFrete(-10);
        }catch(IllegalArgumentException exc){
            //Log.e("Error","Frete negativo!");
            Log.getStackTraceString(exc);
        }

        Log.i("Quantidade", String.valueOf(v.getQuantidade()));
        Log.i("Valor Total", String.valueOf(v.getTotal()));
        Log.i("teste","Teste");
    }
}
