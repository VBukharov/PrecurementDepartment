package org.bukharov.procurementDepartment.logic.gateways;

import java.util.List;

import org.bukharov.procurementDepartment.logic.businessmodel.EditionBO;

public interface EditionGateway {
	public EditionBO findById(int id);
	public List<EditionBO> findAll();
	public int create(EditionBO edition);
	public void delete(EditionBO edition);
	public void update(EditionBO edition);
}
