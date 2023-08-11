package repository;
@Repository
public class TarefaVolatilRepository implements TarefaRepository {
    Map<Long, Tarefa> tarefas;
    private Long nextId;

    public TarefaVolatilRepository(){
        tarefas = new HashMap<>();
        nextId = 1L
    }

    public Tarefa add(Tarefa tarefa){
        return tarefas.put(nextId, tarefa)
    }
}
