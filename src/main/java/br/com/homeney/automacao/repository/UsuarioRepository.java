package br.com.homeney.automacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.homeney.automacao.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
