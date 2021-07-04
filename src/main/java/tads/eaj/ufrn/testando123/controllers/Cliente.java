package tads.eaj.ufrn.testando123.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@Controller
@RequestMapping("/cliente")
public class Cliente {

    @GetMapping
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {

        ProdutoDAO eletro = new ProdutoDAO();
        ArrayList<Produto> pro = eletro.listProduto();

        response.getWriter().println("<table>" +
                "        <tr>" +
                "            <th> nome </th>" +
                "            <th> preco </th>" +
                "            <th> cor </th>" +
                "            <th> marca </th>" +
                "            <th> potencia </th>" +
                "        </tr>");
        for(var p: pro){
            response.getWriter().println("<tr>" +
                    "        <td>" + p.getNome()  + "</td>" +
                    "        <td>" + p.getPreco()  + "</td>" +
                    "        <td>" + p.getCor()  + "</td>" +
                    "        <td>" + p.getMarca()  + "</td>" +
                    "        <td>" + p.getPotencia()  + "</td>" +
                    "    </tr>");
        }
        response.getWriter().println("</table>");
    }

}
