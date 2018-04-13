package com.JonasEnterpriseAssociation.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class computador extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Usuario user = new Usuario();
        boolean sit = false;

        //Adicionar na classe usuario
        user.setNome(request.getParameter("nome"));
        user.setEmail(request.getParameter("email"));
        user.setLogin(request.getParameter("login"));
        user.setSenha(request.getParameter("senha"));

        try {
            //Inserindo no DB
            sit = user.adicionarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(computador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(computador.class.getName()).log(Level.SEVERE, null, ex);
        }

//        criando lista os dados do usuario
//        ArrayList <String> usuario = new ArrayList();
//        
//        
//        usuario.add(user.getNome());
//        usuario.add(user.getEmail());
//        usuario.add(user.getLogin());
//        usuario.add(user.getSenha());
        //Isso seria em outra classe
            if (sit) {
            request.setAttribute("situacao", "Cadastrado com sucesso!");
            request.setAttribute("nome", user.getNome());
            request.setAttribute("email", user.getEmail());
            request.setAttribute("login", user.getLogin());
            request.setAttribute("senha", user.getSenha());
        } else {
            request.setAttribute("situacao", "Falha no cadastro!");
        }
        
        request.getRequestDispatcher("computador.jsp").forward(request, response);

    }

}
