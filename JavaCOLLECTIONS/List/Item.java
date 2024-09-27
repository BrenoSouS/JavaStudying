package List;
public class Item {
    protected String nome;
    protected int quantidade;
    protected double preco;

    public Item(String nome , double preco , int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;

    }

    public String getItem(){
        return "\t Item: " + nome + " | quantidade: " + quantidade + " | preço: " + preco;


    }
    public String getItemNome(){
        return nome;
    }
    
}
