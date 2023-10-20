package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Produto;

public interface ProdutoService {

    Iterable<Produto> buscarTodos();

    Produto buscarPorId(Long id);

   void inserir(Produto produto);

    void deletar(Long id);

    void deletarTodos();
}
