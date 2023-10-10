package treinofit.cepein.exercicios_favoritos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import treinofit.cepein.exercicio.model.Exercicio;

@Entity
@Table(name = "exercicios_favoritos")
@Getter
@Setter
public class ExerciciosFavoritos {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_exercicio_favorito")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "exercicio_id")
    private Exercicio exercicio;

}
