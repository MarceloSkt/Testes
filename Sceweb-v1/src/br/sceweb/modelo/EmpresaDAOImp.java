package br.sceweb.modelo;

import java.nio.charset.CodingErrorAction;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;




public class EmpresaDAOImp implements EmpresaDAO{

	public int adiciona(Empresa empresa) {
		PreparedStatement ps;
		int codigoRetorno=0;

		
		try(Connection conn = (Connection) new FabricadeConexoes().getConnection()){
				
				ps = conn.prepareStatement(
						"insert into empresa(cnpj, nome, nomeFantasia, endereco, telefone) values(?,?,?,?,?)");
				ps.setString(1, empresa.getCnpj());
				ps.setString(2, empresa.getNome());
				ps.setString(3, empresa.getNomeFantasia());
				ps.setString(4, empresa.getEndereco());
				ps.setString(5, empresa.getTelefone());
				
				codigoRetorno= ps.executeUpdate();
				ps.close();
		
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
			
		return codigoRetorno;
		
		}

	@Override
	public Empresa consulta(String cnpj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List consultaEmpresas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean alterar(Empresa empresa) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int excluir(String cnpj){
		PreparedStatement ps;
		int codigoRetorno=0;
		try (java.sql.Connection conn= new FabricadeConexoes().getConnection()){
			ps=conn.prepareStatement("delete from empresa where cnpj= ?");
			ps.setString(1,cnpj);
				
			codigoRetorno= ps.executeUpdate();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
		return codigoRetorno;
	}

}
