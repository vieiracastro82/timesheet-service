package org.wproject.server.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.database.repositories.IProjetoRepository;
import org.wproject.server.service.utils.AbstractGenericService;
import org.wproject.server.utils.entities.ProjetoEntity;
import org.wproject.server.utils.service.interfaces.IProjetoService;

@Named
public class ProjetoService extends AbstractGenericService<ProjetoEntity, Long> implements IProjetoService {

	@Inject
	private IProjetoRepository projetoRepository;

	@Override
	protected JpaRepository<ProjetoEntity, Long> getGenericRepository() {
		return this.projetoRepository;
	}

}
