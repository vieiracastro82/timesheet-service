package org.wproject.server.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.database.repositories.IProjetoCentroCustoRepository;
import org.wproject.server.service.utils.AbstractGenericService;
import org.wproject.server.utils.entities.ProjetoCentroCustoEntity;
import org.wproject.server.utils.entities.keys.ProjetoCentroCustoKeyEntity;
import org.wproject.server.utils.service.interfaces.IProjetoCentroCustoService;

@Named
public class ProjetoCentroCustoService extends AbstractGenericService<ProjetoCentroCustoEntity, ProjetoCentroCustoKeyEntity> implements IProjetoCentroCustoService {

	@Inject
	private IProjetoCentroCustoRepository projetoCentroCustoRepository;

	@Override
	protected JpaRepository<ProjetoCentroCustoEntity, ProjetoCentroCustoKeyEntity> getGenericRepository() {
		return this.projetoCentroCustoRepository;
	}

}
