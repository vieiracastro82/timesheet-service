package org.wproject.server.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.database.repositories.ILogAtividadeRepository;
import org.wproject.server.service.utils.AbstractGenericService;
import org.wproject.server.utils.entities.LogAtividadeEntity;
import org.wproject.server.utils.service.interfaces.ILogAtividadeService;

@Named
public class LogAtividadeService extends AbstractGenericService<LogAtividadeEntity, Long> implements ILogAtividadeService {

	@Inject
	private ILogAtividadeRepository logAtividadeRepository;

	@Override
	protected JpaRepository<LogAtividadeEntity, Long> getGenericRepository() {
		return this.logAtividadeRepository;
	}

}
