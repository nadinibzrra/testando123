package tads.eaj.ufrn.testando123.controllers;

public class Eletrodomesticos{
    private final String DATA_INSERT = "INSERT INTO eletro (NOME,PRECO," +
            "COR,MARCA,POTENCIA,ESTOQUE) " +
            "VALUES (?,?,?,?,?)";
    private final String DATA_LIST = "SELECT * FROM eletro ORDER BY ID";

}
