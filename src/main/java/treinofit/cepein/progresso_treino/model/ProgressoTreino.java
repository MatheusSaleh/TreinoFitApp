package treinofit.cepein.progresso_treino.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import treinofit.cepein.desempenho_treino.model.DesempenhoTreino;
import treinofit.cepein.treino.model.Treino;
import treinofit.cepein.usuario.model.Usuario;

import java.time.LocalDate;

@Entity
@Table(name = "progresso_treino")
@Getter
@Setter
public class ProgressoTreino {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_progresso_treino")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_desempenho_treino")
    private DesempenhoTreino desempenhoTreino;

    @ManyToOne
    @JoinColumn(name = "id_treino")
    private Treino treino;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private LocalDate dataProgresso;
}
