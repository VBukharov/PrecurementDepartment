package org.bukharov.procurementDepartment.logic.usecases;

public interface UseCaseOutput <T> {
	public void setData(T data);
	public T getData();
}
