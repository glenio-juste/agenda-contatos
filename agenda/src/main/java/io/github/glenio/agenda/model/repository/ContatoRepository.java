package io.github.glenio.agenda.model.repository;

import io.github.glenio.agenda.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @data 04/10/2020
 */
public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
