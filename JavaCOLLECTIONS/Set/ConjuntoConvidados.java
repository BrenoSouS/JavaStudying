package Set;
import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {

    private Set<Convidado> setConvidados;

    public ConjuntoConvidados(){
        this.setConvidados = new HashSet<>();
    }

    public void adicionarConvidadoSet(String nome , int codigoConvidado){
        setConvidados.add(new Convidado(nome, codigoConvidado));

    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : setConvidados){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }else{
                System.out.println("convidados com este codigo não existem");
            }
        }
        setConvidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return setConvidados.size();
    }
    public void exibirConvidados(){
        System.out.println(setConvidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados lista = new ConjuntoConvidados();

        lista.adicionarConvidadoSet("Breno", 002);
        lista.adicionarConvidadoSet("Breno", 002);
        lista.adicionarConvidadoSet("Breno", 022);
        lista.adicionarConvidadoSet("Vreno", 502);

        lista.exibirConvidados();
    }
    
}
