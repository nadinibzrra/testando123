package tads.eaj.ufrn.testando123.controllers;


import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAO {
    private final String DATA_INSERT = "INSERT INTO eletro (NOME,PRECO," +
            "COR,MARCA,POTENCIA,ESTOQUE) VALUES (?,?,?,?,?)";
    private final String DATA_LIST = "SELECT * FROM eletro ORDER BY ID";


    public ArrayList<Produto> listProduto(){

        ArrayList<Produto> lista = new ArrayList<>();

        try{
            Connection c = ConectaBanco.getConnection();
            PreparedStatement ps = c.prepareStatement(DATA_LIST);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                Produto p = new Produto(
                        rs.getString("nome"),
                        rs.getDouble("preco"),
                        rs.getString("cor"),
                        rs.getString("marca"),
                        rs.getInt("potencia")
                        );
                lista.add(p);
            }
            c.close();
            System.out.println("lista funcionando");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("deu ERRO");
        } catch (URISyntaxException e) {
            e.printStackTrace();
            System.out.println("deu ERRO DE NOVO");
        }


        return lista;
    }






}
