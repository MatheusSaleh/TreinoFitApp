package treinofit.cepein.treino.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "treino")
@Getter
@Setter

public class Treino {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_treino")
    private Long id;

    @Column(name="nome_treino", nullable = false, length = 30)
    private String nome;

    @Column(name="descricao_treino", nullable = false, length = 40)
    private String descricao;
}
