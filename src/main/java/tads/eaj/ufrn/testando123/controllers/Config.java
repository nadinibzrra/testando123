package tads.eaj.ufrn.testando123.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;

@Controller
@RequestMapping("/config")
public class Config {

    @GetMapping
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException, URISyntaxException {
        ProdutoDAO eletro = new ProdutoDAO();
        eletro.createTab();
        eletro.insertProduto(new Produto("geladeira",2000,"branca", "consul",120));
        eletro.insertProduto(new Produto("fogao",1500,"preta", "philco",150));
        eletro.insertProduto(new Produto("airfryer",300,"vermelha", "polishop",115));
        eletro.insertProduto(new Produto("torradeira",150,"branca", "eletrolux",120));
        eletro.insertProduto(new Produto("microondas",500,"branca", "consul",130));
        response.getWriter().println("ok");
    }
}
