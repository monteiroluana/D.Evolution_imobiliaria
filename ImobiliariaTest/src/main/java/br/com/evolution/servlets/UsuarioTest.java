/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.evolution.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jhonan
 */
public class UsuarioTest {

    String nome;
    String email;
    String login;
    String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean adicionarUsuario() throws SQLException, ClassNotFoundException {
        Conexao conexao = new Conexao();
        Connection conn = conexao.obterConexao();
        boolean success = false;

        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO IMOBILIARIABD.USUARIO (nome, email, login, senha,"
                    + " VALUES (?, ?, ?, ?))");

            stmt.setString(0, this.getNome());
            stmt.setString(1, this.getEmail());
            stmt.setString(2, this.getLogin());
            stmt.setString(3, this.getSenha());

            stmt.execute();
            
        return success = true;    

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return success;
        }
        
        
    }
}
