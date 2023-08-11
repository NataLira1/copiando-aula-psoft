package Tests;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import dto.TarefaPostDTO;
@RequestMapping(
        value = "/v1/tarefas"
)
@SpringBootTest
@DisplayName("Testes de entidade tarefa")
@AutoConfigureMockMvc
public class TarefaV1RestControllerTest {

    @Autowid
    TarefaCriarService tarefaCriarService

            @PostMapping
            ResponseEntity criarTarefa(
                    @RequestBody TarefaDTO tarefaPostDto
            ){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(tarefaCriarService.criar(tarefaPostDTO));
            }


    //US: Eu enquanto usuario gostaria de criar tarefas
    //ID, titulo(único), prioritaria, detalhamento
    //manter == CRUD

    final Url templeate; //isso ta errado
    @Autowired
    MockMvc driver;

    TarefaPostDTO = tarefaRestDTO;

    Object Mapper obbejct mapper;

    @BeforeEach
    void  setUp(){

    }

    @AfterEach
    void tearDown(){

    }

    @Nested
    @DisplayName("Criação de Tarefas")
    class ValidacaoDeEntradas{

        @Test
        @DisplauName("Quando criar tarefa com dados validos")
        void quandoCriarTarefaComDadosValidos(){
            //Arrange
            tarefaPostDTO = TarefaPostDTO.builder()
                    .titulo("COmpra carne")
                    .detalhamento("3kg")
                    .prioritaria(true)
                    .build();

            //Act

            String resultadoStr = driver.perform(MockMvcRequestBuilders.post(URL_TEMPLEAT)
                            .contentType(MediaType.APPLICATION_JSON) //Header
                            .content(objectMapper.writeValeuAsString(tarefaPostDTO))) // body
                    .andExpect(status().isCreatd()) //codigo201 //isCreatd pode variar
                    .andDo(print())
                    .andReturn().getResponse().getContentAsString();

            //tarefa tem que noallcontructor e Allargs algumacoisa
            Tarefa tarefaResultado = objectMapper.covertValue(resultadoStr, Tarefa.class);

            //Assert -> padrão AAA

            assertNotNull(tarefaResultado.getId());
            assertTrue(tarefaResultado.getId > 0);
            assertNorNull(tarefaResultado.getDetalhamento());
            asserEquals(tarefaPostDTO.getTitulo() ,tarefaResultado.getTitulo());


        }

    }


}
