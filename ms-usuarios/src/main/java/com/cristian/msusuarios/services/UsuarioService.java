package com.cristian.msusuarios.services;

import com.cristian.msusuarios.models.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> listar();
    Optional<Usuario> porId(Long id);
    Usuario guardar(Usuario usuario);
    void eliminar(Long id);
    List<Usuario> listarPorIds(Iterable<Long> ids);
    Optional<Usuario> getByEmail(String email);
    boolean existsByEmail(String email);

}
