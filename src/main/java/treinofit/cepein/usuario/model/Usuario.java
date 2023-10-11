package treinofit.cepein.usuario.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    public Long id;

    public String nome;

    public String email;

    public String senha;

    public LocalDate dataNascimento;

    public String genero;

    public String objetivoCondicionamento;
}
