package service;
@Service
public class TarefaV1CriarService implements TarefaCriarService{

    @Autowider
    private TarefaRepository tarefaRepository;

    public Tarefa criar(TarefaPostDTO tarefaPostDTO){
            return tarefaRepository.add(
                    Tarefa.builder()
                            .titulo(tarefa)
            )
    }

    retunr null;
}
