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
        tarefa.setId(nextId++);
        tarefas.put(tarefa.getId(), tarefa);
        return tarefa.get(tarefa.getId());
    }

    public Tarefa update (Long )
}
