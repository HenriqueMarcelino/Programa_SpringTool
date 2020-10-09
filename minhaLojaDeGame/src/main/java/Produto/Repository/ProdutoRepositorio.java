package Produto.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Produto.model.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long>{
	
	public List<Produto> findByDescricaoTitulo(String descricaoTitulo);

}
