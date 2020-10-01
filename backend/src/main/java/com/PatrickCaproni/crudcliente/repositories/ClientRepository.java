package com.PatrickCaproni.crudcliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PatrickCaproni.crudcliente.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
