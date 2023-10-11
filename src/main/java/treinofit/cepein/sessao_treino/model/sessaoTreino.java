package treinofit.cepein.sessao_treino.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import treinofit.cepein.treino.model.Treino;
import treinofit.cepein.usuario.model.Usuario;

import java.time.LocalDateTime;

@Entity
@Table(name = "sessao_treino")
@Getter
@Setter
public class sessaoTreino {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    public Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_treino")
    public Treino treino;

    public LocalDateTime dataHoraDoTreino;
}
