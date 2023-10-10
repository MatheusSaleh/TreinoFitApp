package treinofit.cepein.metas_treino.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Table(name = "meta_treino")
@Getter
@Setter
public class MetaTreino {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_meta_treino")
    private Long id;

    private String descricaoMeta;

    private LocalDate dataInicio;

    private LocalDate dataTermino;
}
