package Set;
import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable <Produto>{
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome , long  codigo , double preco , int quantidade){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    //comparable medoto
    @override
    public int compareTo(Produto o){
        return nome.compareToIgnoreCase(o.getNome());
    }

    public String getNome(){
        return nome;
    }

    public long getCodigo(){
        return codigo;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

    @override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Produto )) return false;
        Produto produto  = (Produto) o; //casting pois o isntanceof antes da versao 16
        return getCodigo() == produto.getCodigo();
    }
    @override
    public int hashCode(){
        return Objects.hash(getCodigo());
        
    }


    @override
    public String toString(){
        return "-Produto: " + nome + " qtd: " + quantidade + " preço: " + preco + " cod. barras: " + codigo + "\n";

    }

}
class ComparatorPorPreco implements Comparator<Produto>{

    public int compare(Produto o1 , Produto o2){
        return Double.compare(o1.getPreco(), o2.getPreco());
    }


}