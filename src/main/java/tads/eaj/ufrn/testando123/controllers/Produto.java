package tads.eaj.ufrn.testando123.controllers;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private String cor;
    private String marca;
    private int potencia;

    public Produto(String nome, double preco, String cor, String marca, int potencia) {
        this.nome = nome;
        this.preco = preco;
        this.cor = cor;
        this.marca = marca;
        this.potencia = potencia;

    }
    public Produto(int id, String nome, double preco, String cor, String marca, int potencia) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.cor = cor;
        this.marca = marca;
        this.potencia = potencia;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
