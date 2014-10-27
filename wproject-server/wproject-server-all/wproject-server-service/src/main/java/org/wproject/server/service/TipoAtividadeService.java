package org.wproject.server.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.database.repositories.ITipoAtividadeRepository;
import org.wproject.server.service.utils.AbstractGenericService;
import org.wproject.server.utils.entities.TipoAtividadeEntity;
import org.wproject.server.utils.service.interfaces.ITipoAtividadeService;

@Named
public class TipoAtividadeService extends AbstractGenericService<TipoAtividadeEntity, Long> implements ITipoAtividadeService {

	@Inject
	private ITipoAtividadeRepository tipoAtividadeRepository;

	@Override
	protected JpaRepository<TipoAtividadeEntity, Long> getGenericRepository() {
		return this.tipoAtividadeRepository;
	}

}
