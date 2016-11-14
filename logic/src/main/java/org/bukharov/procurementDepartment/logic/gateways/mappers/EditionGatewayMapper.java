package org.bukharov.procurementDepartment.logic.gateways.mappers;

import java.util.ArrayList;
import java.util.List;

import org.bukharov.procurementDepartment.logic.businessmodel.AuthorBO;
import org.bukharov.procurementDepartment.logic.businessmodel.EditionBO;
import org.bukharov.procurementDepartment.logic.businessmodel.PublicationOfficeBO;
import org.bukharov.procurementDepartment.model.entity.Author;
import org.bukharov.procurementDepartment.model.entity.Edition;
import org.bukharov.procurementDepartment.model.entity.PublicationOffice;

public class EditionGatewayMapper {

	public static EditionBO createEditionBO(Edition edition) {
		AuthorBO authorBO = AuthorGatewayMapper.createAuthorBO(edition.getAuthor());
		PublicationOfficeBO publicationOfficeBO = PublicationOfficeGatewayMapper
				.createPublicationOfficeBO(edition.getPublicationOffice());
		return new EditionBO(edition.getName(), edition.getYear(), edition.getQuantity(), edition.getAnnotation(),
				edition.getQuantityOfPapers(), authorBO, publicationOfficeBO);
	}

	public static Edition createEdition(EditionBO editionBO) {
		Author author = AuthorGatewayMapper.createAuthor(editionBO.getAuthor());
		PublicationOffice publicationOffice = PublicationOfficeGatewayMapper
				.createPublicationOffice(editionBO.getPublicationOffice());
		return new Edition(editionBO.getName(), editionBO.getYear(), editionBO.getQuantityOfPapers(),
				editionBO.getQuantity(), editionBO.getAnnotation(), publicationOffice, author);
	}
	
	public static List<EditionBO> createAuthorBOList(List<Edition> editionList){
		List<EditionBO> result = new ArrayList<>();
		for(Edition edition: editionList){
			result.add(createEditionBO(edition));
		}
		return result;
	}
}
