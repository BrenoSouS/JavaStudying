package JavaCOLLECTIONS.map;
import java.util.Map;
import java.util.HashMap;
public class EstoqueProdutos {
    private Map<Long , Produto> estoqueProdutosMap;

    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionaProdutoMap(String nome , double preco , int quantidade , long codigo){
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade, codigo));

    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);

    }
    public double calculaValorTotal(){
        double valorTotalEstoque = 0;

        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null ; 
        double maiorPreco = Double.MIN_VALUE; //pesquisar esse metodo
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){

                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            
            }
         }
         return produtoMaisCaro;
    }

}
