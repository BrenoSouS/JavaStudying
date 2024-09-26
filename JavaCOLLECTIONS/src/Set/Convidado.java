package Set;
import java.util.Objects;

public class Convidado {

    private String nome ; 
    private int codigoConvite;
    
    public Convidado(String nome , int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }
    public String getNome(){
        return nome;
    }

    public int getCodigoConvite(){
        return codigoConvite;
    }
    
    @override
    public boolean equals(Object e){
        if(this == e) return true;
        if(!( e instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }
    @override
    public int hashCode(){
        return Objects.hash(getCodigoConvite());
    }


    @override
    public String toString(){
        return " -Convidado: " + nome + " codigo de convite: "+ codigoConvite + "\n";
    }
}
 