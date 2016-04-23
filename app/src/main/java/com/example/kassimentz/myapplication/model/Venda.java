package com.example.kassimentz.myapplication.model;

import java.util.List;

/**
 * Created by 630910144 on 23/04/2016.
 */
public class Venda {

    private int quantidade;
    private Produto produtos;

    public Venda(){

    }

    public double totalVenda(){
        return produtos.getPreco() * quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public Produto getProdutos() {
        return produtos;
    }

    public void addProdutos(Produto produtos) {
        this.produtos = produtos;
    }


}
