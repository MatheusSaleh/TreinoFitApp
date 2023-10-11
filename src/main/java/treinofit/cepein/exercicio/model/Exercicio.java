package treinofit.cepein.exercicio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import treinofit.cepein.treino.model.Treino;

import java.util.List;

@Entity
@Table(name = "exercicio")
@Getter
@Setter
public class Exercicio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exercicio_id")
    private Long id;

    private String nomeExercicio;

    private String descricaoExercicio;

    private String grupoMuscular;

    private String equipamentoNecessario;

    @ManyToMany(mappedBy = "exercicios")
    private List<Treino> treinos;
}
