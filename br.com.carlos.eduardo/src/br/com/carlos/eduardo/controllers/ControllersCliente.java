package br.com.carlos.eduardo.controllers;

import javax.swing.JOptionPane;

import br.com.carlos.eduardo.dao.ClienteDao;
import br.com.carlos.eduardo.dao.ProdutoDao;
import br.com.carlos.eduardo.models.Cliente;
import br.com.carlos.eduardo.models.Produto;

public class ControllersCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClienteDao clientedao = new ClienteDao();
		
		boolean controller1 = true;
		String menu1;
		
		ProdutoDao produtodao = new ProdutoDao();
		
		boolean controller2 = true;
		String menu2;
		
		while(controller1) {
			menu1 = JOptionPane.showInputDialog("Sistema de Cadastro: \n1 - Cadastrar Cliente \n2 - Listar de Clientes \n3 - Apagar Cliente \n4 - Menu Cadastrar Produto");
			switch (menu1) {
			case "1":{
				Cliente cliente = new Cliente();
				cliente.setNome(JOptionPane.showInputDialog("Digite seu Nome Completo:"));
				cliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade:")));
				cliente.setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Digite seu Telefone:")));
				cliente.setEndereco(JOptionPane.showInputDialog("Digite seu Endereço:"));	
				
				clientedao.insert(cliente);
				break;
				}
			
			case "2":{
				for (Cliente cliente : clientedao.lista()) {
					JOptionPane.showMessageDialog(null, cliente.getNome() + "\n" + cliente.getIdade() + "\n" + cliente.getTelefone() + "\n" + cliente.getTelefone());
				}
				break;
				}
			
			case "3":{
				Cliente cliente = new Cliente();
				cliente.setNome(JOptionPane.showInputDialog("Digite seu Nome Completo:"));
				clientedao.deleta(clientedao.getCliente(cliente.getNome()));
				break;
				}
				default:{
					JOptionPane.showMessageDialog(null, "Digite apenas numeros validos !", "Erro", 1);
				}
					
			case "4":{
				menu2 = JOptionPane.showInputDialog("Menu Produto: \n1 - Cadastrar \n2 - Listar de Produtos \n3 - Apagar produto \n4 - Sair");
				switch (menu2) {
				case "1":{
					Produto produto = new Produto();
					produto.setNome(JOptionPane.showInputDialog("Digite nome do produto:"));
					produto.setMarca(JOptionPane.showInputDialog("Digite a marca do produto:"));
					produto.setModelo(JOptionPane.showInputDialog("Digite o modelo do produto:"));
					produto.setPreco(Integer.parseInt(JOptionPane.showInputDialog("Digite o preço do produto:")));	
					
					produtodao.insert(produto);
					break;
					}
				
				case "2":{
					for (Produto produto : produtodao.lista()) {
						JOptionPane.showMessageDialog(null, produto.getNome() + "\n" + produto.getMarca() + "\n" + produto.getModelo() + "\n" + produto.getPreco());
					}
					break;
					}
				
				case "3":{
					Produto produto = new Produto();
					produto.setNome(JOptionPane.showInputDialog("Digite seu Nome Completo:"));
					produtodao.deleta(produtodao.getProduto(produto.getNome()));
					break;
					}
				
				case "4":{
					controller2 = false;
					break; 
					}
					default:{
						JOptionPane.showMessageDialog(null, "Digite apenas numeros validos !", "Erro", 1);
					}
				}
				}
			}
		}
	}
}		