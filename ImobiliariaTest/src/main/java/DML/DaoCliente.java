package DML;

import conexao.Conexao;
import model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DaoCliente {

    public List<Cliente> listar() throws ClassNotFoundException, SQLException {

        List<Cliente> lista = new ArrayList<Cliente>();

        try (Connection con = Conexao.obterConexao();
                PreparedStatement stmt = con.prepareStatement("SELECT * FROM imobiliariadb.CLIENTE");
                ResultSet resultados = stmt.executeQuery();) {

            while (resultados.next()) {
                Integer id = resultados.getInt("idCliente");
                String cpf = resultados.getString("cpf");
                String nome = resultados.getString("nome");
               
                Date d = new Date(resultados.getTimestamp("dataNasc").getTime());
                
                String sexo = resultados.getString("sexo");
                String telefone = resultados.getString("telefone");
                String celular = resultados.getString("celular");
                String email = resultados.getString("email");
                String cep = resultados.getString("cep");
                String endereco = resultados.getString("endereco");
                String bairro = resultados.getString("bairro");
                String cidade = resultados.getString("cidade");
                String uf = resultados.getString("uf");
                String num = resultados.getString("num");
                String complemento = resultados.getString("complemento");

                Cliente cli = new Cliente();
                cli.setIdCliente(id);
                cli.setCpf(cpf);
                cli.setNome(nome);
                cli.setDataNasc(d);
                cli.setSexo(sexo);
                cli.setTelefone(telefone);
                cli.setCelular(celular);
                cli.setEmail(email);
                cli.setCep(cep);
                cli.setEndereço(endereco);
                cli.setBairro(bairro);
                cli.setCidade(cidade);
                cli.setUf(uf);
                cli.setNum(num);
                cli.setComplemento(complemento);
                lista.add(cli);
            }
        }
        return lista;
    }

    public void iserir(Cliente cliente) throws SQLException {

        String sql = "INSERT INTO imobiliariadb.CLIENTE(cpf,nome,dataNasc,sexo,telefone,celular,email,cep,endereco,bairro,cidade,uf,num,complemento)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = null;
        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            
            Timestamp tDataNasc = new Timestamp(cliente.getDataNasc().getTime());
            stmt.setTimestamp(3, tDataNasc);
            
            stmt.setString(4, cliente.getSexo());
            stmt.setString(5, cliente.getTelefone());
            stmt.setString(6, cliente.getCelular());
            stmt.setString(7, cliente.getEmail());
            stmt.setString(8, cliente.getCep());
            stmt.setString(9, cliente.getEndereço());
            stmt.setString(10, cliente.getBairro());
            stmt.setString(11, cliente.getCidade());
            stmt.setString(12, cliente.getUf());
            stmt.setString(13, cliente.getNum());
            stmt.setString(14, cliente.getComplemento());
            
            
            
            stmt.execute();

        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }

    }

  
}
