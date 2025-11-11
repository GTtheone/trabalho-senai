package com.senai.infob.vava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infob.vava.models.Endereco;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
}