package Set;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtoSet;
    
    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }
    public void adicionarproduto(String nome , long codigo , double preco , int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));

    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }
    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;

    }


    
}
