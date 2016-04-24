package com.example.kassimentz.myapplication;

import com.example.kassimentz.myapplication.model.Produto;
import com.example.kassimentz.myapplication.model.Venda;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

/**
 * Created by 630910144 on 23/04/2016.
 */
public class VendaTeste {

    @Test
    public void addProduto_isCorrect(){
        Venda venda = new Venda();
        Produto p = new Produto("Produto 1", 30);
        venda.addProduto(p);

        assertTrue(venda.getListaProdutos().contains(p));
        int valorEsperado = 1;
        assertEquals(valorEsperado,venda.getQuantidade());

    }

    @Test
    public void getTotal_isCorrect(){
        Venda v = new Venda();
        v.addProduto(new Produto("cadeira", 30));
        v.addProduto(new Produto("mesa", 120));
        v.addProduto(new Produto("copos", 10));
        try {
            v.setFrete(-10);
            fail("Nao caiu na excecao");
        }catch(IllegalArgumentException exc){
            //Log.e("Error","Erro no frete");
        }

        v.setFrete(10);

        int quantidadeEsperada = 3;
        assertEquals(quantidadeEsperada, v.getQuantidade());

        double valorTotalEsperado = 30+120+10+0;
        assertEquals(valorTotalEsperado, v.getTotal(),0);
    }
}
