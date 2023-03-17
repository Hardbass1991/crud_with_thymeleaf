package com.app.web.repositorio;

import com.app.web.entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long> {

}
