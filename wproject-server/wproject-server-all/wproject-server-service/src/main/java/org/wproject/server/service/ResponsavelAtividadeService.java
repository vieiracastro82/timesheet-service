package org.wproject.server.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.database.repositories.IResponsavelAtividadeRepository;
import org.wproject.server.service.utils.AbstractGenericService;
import org.wproject.server.utils.entities.ResponsavelAtividadeEntity;
import org.wproject.server.utils.service.interfaces.IResponsavelAtividadeService;

@Named
public class ResponsavelAtividadeService extends AbstractGenericService<ResponsavelAtividadeEntity, Long> implements IResponsavelAtividadeService {

	@Inject
	private IResponsavelAtividadeRepository responsavelAtividadeRepository;

	@Override
	protected JpaRepository<ResponsavelAtividadeEntity, Long> getGenericRepository() {
		return this.responsavelAtividadeRepository;
	}

}
