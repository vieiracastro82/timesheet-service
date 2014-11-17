package org.wproject.server.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.database.repositories.IUsuarioRepository;
import org.wproject.server.service.utils.AbstractGenericService;
import org.wproject.server.utils.entities.UsuarioEntity;
import org.wproject.server.utils.service.interfaces.IUsuarioService;

@Named
public class UsuarioService extends AbstractGenericService<UsuarioEntity, Long> implements IUsuarioService {

	@Inject
	private IUsuarioRepository usuarioRepository;

	@Override
	protected JpaRepository<UsuarioEntity, Long> getGenericRepository() {
		return this.usuarioRepository;
	}

	@Override
	public UsuarioEntity findById(Long id) {
		return this.usuarioRepository.findOne(id);
	}

}
