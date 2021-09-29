package br.com.carlos.eduardo.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.carlos.eduardo.models.Produto;

public class ProdutoDao {
	
	List<Produto> produtos = new ArrayList<Produto>();
	
	public void insert(Produto produto) {
		produtos.add(produto);
	}
	
	public void deleta(Produto produto) {
		produtos.remove(produto);
	}
	
	public List<Produto> lista(){
		return produtos;
	}
	
	public Produto getProduto(String nome) {
		Produto produtoRet = new Produto();
		
		for(Produto produto: produtos) {
			if(produto.getNome().equals(nome)) {
				produtoRet = produto;
			}
		}
		return produtoRet;
	}
}