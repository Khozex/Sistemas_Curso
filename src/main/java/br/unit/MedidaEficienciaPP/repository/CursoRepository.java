package br.unit.MedidaEficienciaPP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unit.MedidaEficienciaPP.Model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
