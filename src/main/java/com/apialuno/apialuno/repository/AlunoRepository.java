package com.apialuno.apialuno.repository;


import com.apialuno.apialuno.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}

