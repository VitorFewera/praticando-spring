package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.ClienteRepository;
import one.digitalinnovation.gof.model.EnderecoRepository;
import one.digitalinnovation.gof.model.Produto;
import one.digitalinnovation.gof.model.ProdutoRepository;
import one.digitalinnovation.gof.service.ProdutoService;
import one.digitalinnovation.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProdutoServicelmpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Produto> buscarTodos() {
        return null;
    }

    @Override
    public Produto buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Produto produto) {

    }

    @Override
    public void atualizar(Long id, Produto produto) {

    }

    @Override
    public void deletar(Long id) {

    }

    @Override
    public void deletarTodos() {

    }
}
