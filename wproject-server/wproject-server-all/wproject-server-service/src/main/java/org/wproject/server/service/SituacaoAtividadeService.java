package org.wproject.server.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.database.repositories.ISituacaoAtividadeRepository;
import org.wproject.server.service.utils.AbstractGenericService;
import org.wproject.server.utils.entities.SituacaoAtividadeEntity;
import org.wproject.server.utils.service.interfaces.ISituacaoAtividadeService;

@Named
public class SituacaoAtividadeService extends AbstractGenericService<SituacaoAtividadeEntity, Long> implements ISituacaoAtividadeService {

	@Inject
	private ISituacaoAtividadeRepository situacaoAtividadeRepository;

	@Override
	protected JpaRepository<SituacaoAtividadeEntity, Long> getGenericRepository() {
		return this.situacaoAtividadeRepository;
	}

}
