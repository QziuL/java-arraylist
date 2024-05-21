import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) { tarefas.add(new Tarefa(descricao)); }

    public void removerTarefa(String descricao) {
        // lambda e predicado
        this.tarefas.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
    }

    public int obterNumeroTotalTarefas() { return tarefas.size(); }

    public void obterDescricaoTarefas(){
        for(Tarefa t : tarefas){
            System.out.println(t.getDescricao());
        }
    }
}
