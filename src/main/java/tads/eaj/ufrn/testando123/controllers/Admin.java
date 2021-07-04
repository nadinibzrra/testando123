package tads.eaj.ufrn.testando123.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/admin")
public class Admin {

    @GetMapping
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("<h1>CADASTRAR</h1>");
        response.getWriter().println("<form method = post>" +
                "       <label>Nome Produto: </label><input type=text name=nome > </br> </br>   " +
                "       <label>Preco: </label><input type=double name=preco  > </br> </br>  " +
                "       <label>Cor: </label><input type=text name=cor  > </br> </br>     " +
                "       <label>Marca: </label><input type=text name=marca  > </br> </br>     " +
                "       <label>Potencia: </label><input type=int name=potencia  > </br> </br> " +
                "                <button type=submit  value=submit >ENVIAR</button>  " +
                "                      </form>  ");
    }
    @RequestMapping(value = "/cadastra", method = RequestMethod.POST)
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

    }
}
