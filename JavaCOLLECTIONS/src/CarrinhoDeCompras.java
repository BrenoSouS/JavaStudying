import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaCompras;

    public CarrinhoDeCompras(){
        this.listaCompras = new ArrayList<>();
    }
    

    public void adicionarItemLista(String nome , double preco ,int quantidade ){
        listaCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> listaRemover = new ArrayList<>();

        for(Item i : listaCompras){
            if(i.getItemNome().equalsIgnoreCase(nome)){
                listaRemover.add(i);
            }

        }
        listaCompras.removeAll(listaRemover);
    }

    public void exibirItens(){
        for (Item i : listaCompras){
            System.out.println(i.getItem());
        }
    }

    public double calcularValorTotal(){
        double total = 0;
        for (Item i : listaCompras){
            double totalPorQuantidade = i.quantidade * i.preco;
            total += totalPorQuantidade;

        }
        return total;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras compras = new CarrinhoDeCompras();
        
        compras.adicionarItemLista("massa de tomate", 3.0, 2);
        compras.adicionarItemLista("macarrão", 4, 3);
        compras.exibirItens();
        System.out.println("O preço total é de: " + compras.calcularValorTotal());        
    }
}
