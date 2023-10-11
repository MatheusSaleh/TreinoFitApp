package treinofit.cepein.metas_treino.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import treinofit.cepein.usuario.model.Usuario;

import java.time.LocalDate;

@Entity
@Table(name = "meta_treino")
@Getter
@Setter
public class MetaTreino {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_meta_treino")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    public Usuario usuario;

    private String descricaoMeta;

    private LocalDate dataInicio;

    private LocalDate dataTermino;
}
