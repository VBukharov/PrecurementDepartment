package org.bukharov.procurementDepartment.logic.gateways.mappers;

import java.util.ArrayList;
import java.util.List;

import org.bukharov.procurementDepartment.logic.businessmodel.PublicationOfficeBO;
import org.bukharov.procurementDepartment.model.entity.PublicationOffice;

public class PublicationOfficeGatewayMapper {
	public static PublicationOfficeBO createPublicationOfficeBO(PublicationOffice publicationOffice){
		return new PublicationOfficeBO(publicationOffice.getName(), publicationOffice.getLocation(), publicationOffice.getDescription());
	}
	
	public static PublicationOffice createPublicationOffice(PublicationOfficeBO publicationOfficeBO){
		return new PublicationOffice(publicationOfficeBO.getName(), publicationOfficeBO.getLocation(), publicationOfficeBO.getDescription());
	}
	
	public static List<PublicationOfficeBO> createPublicationOfficeBOList(List<PublicationOffice> publicationOfficeList){
		List<PublicationOfficeBO> result = new ArrayList<>();
		for(PublicationOffice office : publicationOfficeList){
			result.add(createPublicationOfficeBO(office));
		}
		return result;
	}
}
