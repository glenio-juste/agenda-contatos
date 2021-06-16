package io.github.glenio.agenda.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @data 04/10/2020
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 150, nullable = false) // not null
    private String nome;

    @Column(name = "email", length = 150, nullable = false)
    private String email;

    @Column
    private Boolean favorito;

    /*public void setFavorito(Boolean favorito) {
        this.favorito = favorito;
    }*/
}
