package com.example.demo.payroll;
import com.example.demo.payroll.ConstantesRepository;
import com.example.demo.payroll.ConstantesNotFoundException;
import com.example.demo.payroll.Constantes;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ConstantesController {

	private final ConstantesRepository repository;

	ConstantesController(ConstantesRepository repository) {
		this.repository = repository;
	}

	// Aggregate root

	@GetMapping("/Constantess")
	List<Constantes> all() {
		return repository.findAll();
	}

	@PostMapping("/Constantess")
	Constantes consRep(@RequestBody Constantes consRep) {
		return repository.save(consRep);
	}

	// Single item

	@GetMapping("/Constantess/{id}")
	Constantes one(@PathVariable int id) {

		return repository.findById(id)
			.orElseThrow(() -> new ConstantesNotFoundException(id));
	}

	@PutMapping("/Constantess/{id}")
	Constantes replaceConstantes(@RequestBody Constantes consRep, @PathVariable int id) {

		return repository.findById(id)
			.map(Constantes -> {
				Constantes.setEstopaM2(consRep.getEstopaM2());
				return repository.save(Constantes);
			})
			.orElseGet(() -> {
				consRep.setIdConstantes(id);
				return repository.save(consRep);
			});
	}

	@DeleteMapping("/Constantess/{id}")
	void deleteConstantes(@PathVariable int id) {
		repository.deleteById(id);
	}
}