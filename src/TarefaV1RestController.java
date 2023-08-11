public class TarefaV1RestController {

    @PostMapping
    ResponseEntity criarTarefa(
            @RequestBody TarefaPostDTO tarefaPostDTO){

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(tarefa);
    }

}
