public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // criando novas tarefas
        listaTarefas.adicionarTarefa("Passar na farmácia e comprar Dorflex.");
        listaTarefas.adicionarTarefa("Fazer Compras.");
        listaTarefas.adicionarTarefa("Buscar o Zézinho na escola.");

        // exibindo as tarefas
        System.out.println("\nSuas Tarefas");
        System.out.println("------------------------------------------------");
        listaTarefas.obterDescricaoTarefas();

        System.out.println("\nTotal de tarefas: "+listaTarefas.obterNumeroTotalTarefas());

        // removendo uma tarefa
        listaTarefas.removerTarefa("fazer compras.");

        System.out.println("------------------------------------------------");
        listaTarefas.obterDescricaoTarefas();
        System.out.println("\nTotal de tarefas: "+listaTarefas.obterNumeroTotalTarefas());
        System.out.println("------------------------------------------------");
    }
}