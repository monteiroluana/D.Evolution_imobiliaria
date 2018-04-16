package br.com.evolution.servlets;

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

import br.com.evolution.dao.DaoUsuario;
import br.com.evolution.model.Usuario;

public class ComputadorBuscar extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Usuario user = new Usuario();
        DaoUsuario daoUsuario = new DaoUsuario();
        boolean sit = false;

        //lista que receberá lista de usuarios 
        List<Usuario> lista = new ArrayList<Usuario>();

        try {
            //buscando do DB e guardando na lista
            lista = daoUsuario.listar();
            //verificando se a lista não esta vazia
            if (!lista.isEmpty()) {
                sit = true;
                request.setAttribute("listaUsuarios", lista);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ComputadorInserir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComputadorBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }

              

        request.getRequestDispatcher("computadorBuscar.jsp").forward(request, response);

    }
}
