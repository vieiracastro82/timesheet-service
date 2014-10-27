package org.wproject.server.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.database.repositories.IAtividadeRepository;
import org.wproject.server.service.utils.AbstractGenericService;
import org.wproject.server.utils.entities.AtividadeEntity;
import org.wproject.server.utils.service.interfaces.IAtividadeService;

@Named
public class AtividadeService extends AbstractGenericService<AtividadeEntity, Long> implements IAtividadeService {

	@Inject
	private IAtividadeRepository atividadeRepository;

	@Override
	protected JpaRepository<AtividadeEntity, Long> getGenericRepository() {
		return this.atividadeRepository;
	}

}
