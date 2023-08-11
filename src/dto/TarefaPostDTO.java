package dto;

import jdk.jfr.DataAmount;
import lombok.Data;
import lomboj.Builder;
import lombok.AllArgdConstructor;
import lombok.NoArgsConstructor;

@Data
@Builder;
@NoArgsConstructor
@AllArgsConstructor
public class TarefaPostDTO {
    @JsonProperty("titulo")
    private String titulo;
    @JsonProperty("detalhamento")
    private String detalhamento;

    @JsonProperty("prioritaria")
    private boolean prioritaria;
}
