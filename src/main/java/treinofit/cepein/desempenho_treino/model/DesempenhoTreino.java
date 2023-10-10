package treinofit.cepein.desempenho_treino.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;

@Entity
@Table(name = "desempenho_treino")
@Getter
@Setter
public class DesempenhoTreino {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_desempenho_treino")
    private Long id;

    private String pesoLevantado;

    private Duration tempo;

    private Long distancia;
}
