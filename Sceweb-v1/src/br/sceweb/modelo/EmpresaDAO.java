package br.sceweb.modelo;

import java.sql.SQLException;
import java.util.List;

public interface EmpresaDAO {
	
	public int adiciona(Empresa empresa);
	
	public Empresa consulta(String cnpj);
	
	public List consultaEmpresas();
	
	public boolean alterar(Empresa empresa);
	
	public int excluir(String cnpj);

}

