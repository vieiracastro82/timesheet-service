package org.wproject.server.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.database.repositories.IParametrosRepository;
import org.wproject.server.service.utils.AbstractGenericService;
import org.wproject.server.utils.entities.ParametrosEntity;
import org.wproject.server.utils.service.interfaces.IParametrosService;

@Named
public class ParametrosService extends AbstractGenericService<ParametrosEntity, Long> implements IParametrosService {

	@Inject
	private IParametrosRepository parametrosRepository;

	@Override
	protected JpaRepository<ParametrosEntity, Long> getGenericRepository() {
		return this.parametrosRepository;
	}

}
