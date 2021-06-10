	package br.unit.MedidaEficienciaPP.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.unit.MedidaEficienciaPP.Model.Curso;
import antlr.collections.List;
import br.unit.MedidaEficienciaPP.repository.CursoRepository;

@RestController
@RequestMapping("/cursos")
public class CursoController {
	
	@Autowired
	private CursoRepository cursoRepository;

	@GetMapping("/listar")
	public ArrayList<Curso> listar(){
		return (ArrayList<Curso>) cursoRepository.findAll();
	}
	
	@PostMapping("/adicionar")
	public Curso adicionar(@RequestBody Curso curso) {
		return cursoRepository.save(curso);
	}
	
	@DeleteMapping("/deletar")
	public void remover(@RequestBody Curso curso) {
		cursoRepository.delete(curso);
	}
	@PutMapping("/atualizar")
	public Curso atualizarCurso (@RequestBody Curso curso) {
		return cursoRepository.save(curso);
	}
}

	