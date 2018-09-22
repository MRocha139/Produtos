package com.example.produtos;

public class Produto {
    private String nome;
    private String categoria;
    private String quantidade;
    private String valor;

    public Produto(){}

    public Produto(String nome, String categoria, String quantidade, String valor){
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getCategoria() { return categoria; }

    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getQuantidade() { return quantidade; }

    public void setQuantidade(String quantidade) { this.quantidade = quantidade; }

    public String getValor() { return valor; }

    public void setValor(String valor) { this.valor = valor; }

}
