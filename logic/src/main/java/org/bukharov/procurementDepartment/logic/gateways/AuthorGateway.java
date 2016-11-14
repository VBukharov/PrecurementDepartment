package org.bukharov.procurementDepartment.logic.gateways;

import java.util.List;

import org.bukharov.procurementDepartment.logic.businessmodel.AuthorBO;

public interface AuthorGateway {
	public AuthorBO findById(int id);
	public List<AuthorBO> findAll();
	public int create(AuthorBO author);
	public void update(AuthorBO author);
	public void delete(AuthorBO author);
}
