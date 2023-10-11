package treinofit.cepein.treino.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import treinofit.cepein.exercicio.model.Exercicio;
import treinofit.cepein.usuario.model.Usuario;

import java.util.List;

@Entity
@Table(name = "treino")
@Getter
@Setter

public class Treino {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_treino")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    public Usuario usuario;

    @Column(name="nome_treino", nullable = false, length = 30)
    private String nome;

    @Column(name="descricao_treino", nullable = false, length = 40)
    private String descricao;

    @ManyToMany
    @JoinTable(name = "treino_exercicio",
            joinColumns = @JoinColumn(name = "treino_id"),
            inverseJoinColumns = @JoinColumn(name = "exercicio_id"))
    private List<Exercicio> exercicios;
}
