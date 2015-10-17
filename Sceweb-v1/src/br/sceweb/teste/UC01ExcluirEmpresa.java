package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;
import br.sceweb.modelo.EmpresaDAOImp;


public class UC01ExcluirEmpresa {	
    
	static EmpresaDAO empresaDAO=null; 
	static Empresa empresa = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO= new EmpresaDAOImp();
		empresa= new Empresa();
		empresa.setCnpj("89424232/000180");
	}
	@Test
	public void CT02UC01FBExclui_com_sucesso() {
		assertEquals(1, empresaDAO.excluir(empresa.getCnpj()));
	}

}
