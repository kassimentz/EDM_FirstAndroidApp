package com.example.kassimentz.myapplication;

import com.example.kassimentz.myapplication.model.Produto;
import com.example.kassimentz.myapplication.model.Venda;

import org.junit.Test;

/**
 * Created by 630910144 on 23/04/2016.
 */
public class VendaTeste {

    @Test
    public void addProdutos_isCorrect(){
        Venda venda = new Venda(new Produto("Produto 1", 30),10);

    }
}
