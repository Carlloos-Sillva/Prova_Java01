package br.com.carlos.eduardo.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.carlos.eduardo.models.Cliente;

public class ClienteDao {
	
	List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void insert(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void deleta(Cliente cliente) {
		clientes.remove(cliente);
	}
	
	public List<Cliente> lista(){
		return clientes;
	}
	
	public Cliente getCliente(String nome) {
		
		Cliente clienteRet = new Cliente();
		
		for(Cliente cliente: clientes) {
			if(cliente.getNome().equals(nome)) {
				clienteRet = cliente;
			}
		}
		return clienteRet;
	}
}
