package List;
import java.util.ArrayList;
import java.util.List;
public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
        
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();

        lista.adicionarTarefa("tarefa1");
        lista.adicionarTarefa("Tarefa2");
        lista.adicionarTarefa("Tarefa3");
        lista.adicionarTarefa("Tarefa2");
        System.out.println("O numeto total de elementos na lista é " + lista.obterNumeroTotalTarefas());
        
        lista.removerTarefa("tarefa1");
        System.out.println("O numeto total de elementos na lista é " + lista.obterNumeroTotalTarefas());

        lista.obterDescaoTarefas();
    }
}
