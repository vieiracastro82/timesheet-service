package org.wproject.server.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.database.repositories.ITrabalhoRealizadoRepository;
import org.wproject.server.service.utils.AbstractGenericService;
import org.wproject.server.utils.entities.TrabalhoRealizadoEntity;
import org.wproject.server.utils.service.interfaces.ITrabalhoRealizadoService;

@Named
public class TrabalhoRealizadoService extends AbstractGenericService<TrabalhoRealizadoEntity, Long> implements ITrabalhoRealizadoService {

	@Inject
	private ITrabalhoRealizadoRepository trabalhoRealizadoRepository;

	@Override
	protected JpaRepository<TrabalhoRealizadoEntity, Long> getGenericRepository() {
		return this.trabalhoRealizadoRepository;
	}

}
