package com.alunoonline.api.controller;

import com.alunoonline.api.model.Aluno;
import com.alunoonline.api.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    AlunoService service;

    @PatchMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Aluno> create(@RequestBody Aluno aluno){
        Aluno alunoCreated = service.create(aluno);

        return ResponseEntity.status(201).body(alunoCreated);
    }
}
