package org.wproject.server.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.database.repositories.ICentroCustoRepository;
import org.wproject.server.service.utils.AbstractGenericService;
import org.wproject.server.utils.entities.CentroCustoEntity;
import org.wproject.server.utils.service.interfaces.ICentroCustoService;

@Named
public class CentroCustoService extends AbstractGenericService<CentroCustoEntity, Long> implements ICentroCustoService {

	@Inject
	private ICentroCustoRepository centroCustoRepository;

	@Override
	protected JpaRepository<CentroCustoEntity, Long> getGenericRepository() {
		return this.centroCustoRepository;
	}

}
