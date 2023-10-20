package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Produto;

public interface ProdutoService {

    Iterable<Produto> buscarTodos();

    Produto buscarPorId(Long id);

    Produto inserir(Produto produto);

    void deletar(Long id);

    void deletarTodos();
}
