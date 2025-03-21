package com.trainer.Trainer_CRUD;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	TrainerRepo repo;

	@PostMapping("/trainer")
	public Trainer save(@RequestBody Trainer tr) {
		Trainer t = repo.save(tr);
		return t;
	}

	@PutMapping("/trainer")
	public Trainer updte(@RequestBody Trainer tr) {
		Trainer t = repo.save(tr);
		return t;
	}

	@GetMapping("/trainer")
	public List<Trainer> showAll() {
		List<Trainer> list = repo.findAll();
		return list;
	}

	@GetMapping("trainer/{id}")
	public Trainer findById(@PathVariable int id) {
		Optional<Trainer> optional = repo.findById(id);
		if (optional.isPresent()) {
			Trainer e = optional.get();
			return e;
		}
		return null;
	}

	@DeleteMapping("trainer/{id}")
	public void deleteByID(@PathVariable int id) {
		Optional<Trainer> optional = repo.findById(id);
		if (optional.isPresent()) {
			Trainer e = optional.get();
			repo.delete(e);

		}
	}

	@DeleteMapping("trainer/deleteByName/{name}")
	public int deleteByName(@PathVariable String name) {
		return repo.deleteByName(name);
	}

	@GetMapping("trainer/findByName/{name}")
	public List<Trainer> findByName(@PathVariable String name) {
		return repo.findByName(name);
	}

	@GetMapping("trainer/findBySub/{subject}")
	public List<Trainer> findBySub(@PathVariable String subject) {
		return repo.findBySubject(subject);
	}

	@GetMapping("trainer/fetchByName/{name}")
	public List<Trainer> FetchByName(@PathVariable String name) {
		return repo.fetchByName(name);
	}

	@GetMapping("trainer/fetchBySub/{subject}")
	public List<Trainer> FetchBySub(@PathVariable String subject) {
		return repo.FetchBySub(subject);
	}

}
