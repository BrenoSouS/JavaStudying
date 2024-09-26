package Set;
import java.util.Objects;

public class Contato{
     private String nome;
     private int numero;

     public Contato(String nome , int numero){
        this.numero = numero;
        this.nome = nome;

     }

     public String getNome(){
        return nome;
     }

     public int getNumero(){
        return numero;
     }
     public void setNumero(int numero){
        this.numero = numero;
     }

     @override
     public String toString(){
        return "-Contato: " + nome + " Numero:" + numero + "\n";

     }

     @override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());

    }
    @override
    public int hashCode(){
        return Objects.hash(getNome());
    }

}