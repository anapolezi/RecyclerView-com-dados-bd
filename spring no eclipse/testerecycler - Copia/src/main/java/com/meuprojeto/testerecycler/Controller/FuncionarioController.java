package com.meuprojeto.testerecycler.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meuprojeto.testerecycler.Model.Funcionario;
import com.meuprojeto.testerecycler.Repository.FuncionarioRepository;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
	
	@Autowired
    private FuncionarioRepository funcionarioRepository;


    // GET para retornar todos os funcionários
    @GetMapping
    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();  // retorna todos os funcionários do banco
    }

    // POST para adicionar um novo funcionário
    @PostMapping
    public Funcionario adicionarFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);  // salva o funcionário no banco
    }
}