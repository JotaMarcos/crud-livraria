package br.com.masterbare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.masterbare.model.*;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
