package Set;
import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();

    }

    public void adicionarContato(String nome , int numero){
        contatoSet.add(new Contato(nome, numero));

    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome , int numero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){

            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Breno", 909090);
        agenda.adicionarContato("Breno", 809090);
        agenda.adicionarContato("Breno SOuza", 9090);
        agenda.adicionarContato("vreno", 777090);

        agenda.exibirContatos();
        agenda.atualizarNumeroContato("Breno" , 2222222);
        agenda.exibirContatos();

        System.out.println(agenda.pesquisarNome("vreno"));
    }

}
