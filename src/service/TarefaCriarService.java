package service;

@FunctionalInterface
public interface TarefaCriarService {
    public Tarefa criar(TarefaPostDTO tarafaPostDTO);
}
