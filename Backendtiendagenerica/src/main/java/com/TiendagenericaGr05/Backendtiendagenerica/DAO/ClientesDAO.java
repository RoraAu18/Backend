package com.TiendagenericaGr05.Backendtiendagenerica.DAO;

import  com.TiendagenericaGr05.Backendtiendagenerica.Model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesDAO extends JpaRepository<Clientes, Long> {

}
