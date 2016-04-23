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
        Log.i("out", "Hello World");
        System.out.println("Olá mundo!");

        Produto shampoo = new Produto();
        shampoo.setDescricao("shampoo anti caspa");
        shampoo.setNome("Clear And Clean");
        shampoo.setPreco(17.00);

        Produto sabonete = new Produto();
        sabonete.setDescricao("sabonete hidratante");
        sabonete.setNome("Dove");
        sabonete.setPreco(2.00);



        Venda venda = new Venda();
        venda.addProdutos(sabonete);
        venda.setQuantidade(10);

        Log.i("Quantidade Venda 1", String.valueOf(venda.getQuantidade()));
        Log.i("Valor total Venda 1",String.valueOf(venda.totalVenda()));

        Venda venda2 = new Venda();
        venda2.addProdutos(shampoo);
        venda2.setQuantidade(2);

        Log.i("Quantidade Venda 2", String.valueOf(venda2.getQuantidade()));
        Log.i("Valor total Venda 2",String.valueOf(venda2.totalVenda()));

        Log.i("out","Teste");
    }
}
