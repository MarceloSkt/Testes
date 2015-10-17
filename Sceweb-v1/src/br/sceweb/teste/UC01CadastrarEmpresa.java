package br.sceweb.teste;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.*;
public class UC01CadastrarEmpresa {
	
	static EmpresaDAOImp empresaDAO;
	static Empresa empresa;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	empresaDAO = new EmpresaDAOImp();
	empresa = new Empresa();
	empresa.setNome("empresa x");
	empresa.setCnpj("89424232/000180");
	empresa.setNomeFantasia("empresa x");
	empresa.setEndereco("rua taquari");
	empresa.setTelefone("2222");
	}
	/**
	 * obj - verificar o comportamento do sistema na
	 * inclusão de uma empresa com sucesso
	 */
	@Test
	public void CT01UC01FBCadastra_com_sucesso() {
		assertEquals(1, empresaDAO.adiciona(empresa));
	}
		
		
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}