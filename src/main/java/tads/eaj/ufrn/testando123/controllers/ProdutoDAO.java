package tads.eaj.ufrn.testando123.controllers;


import java.net.URISyntaxException;
import java.sql.*;
import java.util.ArrayList;

public class ProdutoDAO {
    private final String DATA_CREATE = "CREATE TABLE eletro (" +
            "id SERIAL PRIMARY KEY NOT NULL," +
            "nome varchar(50) NOT NULL," +
            "preco DECIMAL(7, 2) NOT NULL," +
            "cor varchar(50) NOT NULL," +
            "marca varchar(50) NOT NULL," +
            "potencia int NOT NULL" +
            ")";
    private final String DATA_INSERT = "INSERT INTO eletro (NOME,PRECO," +
            "COR,MARCA,POTENCIA) VALUES (?,?,?,?,?)";
    private final String DATA_LIST = "SELECT * FROM eletro ORDER BY ID";


    public void createTab() throws SQLException, URISyntaxException {
        Connection c = ConectaBanco.getConnection();
        Statement s = c.createStatement();
        s.execute(DATA_CREATE);
        System.out.println("criou o tabela");
        c.close();
    }

    public void insertProduto(Produto p) throws SQLException{
        try {
            Connection c = ConectaBanco.getConnection();
            PreparedStatement ps = c.prepareStatement(DATA_INSERT);
            ps.setString(1,p.getNome());
            ps.setDouble(2,p.getPreco());
            ps.setString(3,p.getCor());
            ps.setString(4,p.getMarca());
            ps.setInt(5,p.getPotencia());
            ps.execute();
            c.close();
            System.out.println("cadastro funcionou");
        } catch (URISyntaxException e) {
            e.printStackTrace();
            System.out.println("deu ERRO");
        }
    }


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
