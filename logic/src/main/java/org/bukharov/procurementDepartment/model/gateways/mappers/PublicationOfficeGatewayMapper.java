package org.bukharov.procurementDepartment.model.gateways.mappers;

import java.util.ArrayList;
import java.util.List;

import org.bukharov.procurementDepartment.logic.businessmodel.PublicationOfficeBO;
import org.bukharov.procurementDepartment.model.entity.PublicationOffice;

public class PublicationOfficeGatewayMapper {
	public static PublicationOfficeBO createPublicationOfficeBO(PublicationOffice publicationOffice){
		if(publicationOffice == null)
			return null;
		return new PublicationOfficeBO(publicationOffice.getName(), publicationOffice.getLocation(), publicationOffice.getDescription());
	}
	
	public static PublicationOffice createPublicationOffice(PublicationOfficeBO publicationOfficeBO){
		if(publicationOfficeBO == null)
			return null;
		return new PublicationOffice(publicationOfficeBO.getName(), publicationOfficeBO.getLocation(), publicationOfficeBO.getDescription());
	}
	
	public static List<PublicationOfficeBO> createPublicationOfficeBOList(List<PublicationOffice> publicationOfficeList){
		if(publicationOfficeList == null)
			return null;
		List<PublicationOfficeBO> result = new ArrayList<>();
		for(PublicationOffice office : publicationOfficeList){
			result.add(createPublicationOfficeBO(office));
		}
		return result;
	}
}
