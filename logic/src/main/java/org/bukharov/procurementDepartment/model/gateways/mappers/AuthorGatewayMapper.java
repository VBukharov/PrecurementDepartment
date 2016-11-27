package org.bukharov.procurementDepartment.model.gateways.mappers;

import java.util.ArrayList;
import java.util.List;

import org.bukharov.procurementDepartment.logic.businessmodel.AuthorBO;
import org.bukharov.procurementDepartment.model.entity.Author;

public class AuthorGatewayMapper {
	public static AuthorBO createAuthorBO(Author author){
		if(author == null)
			return null;
		return new AuthorBO(author.getName(), author.getSurname(), author.getSecondName(), author.getBiography());
	}
	
	public static Author createAuthor(AuthorBO authorBO){
		return new Author(authorBO.getName(), authorBO.getSurname(), authorBO.getSecondName(), authorBO.getBiography());
	}
	
	public static List<AuthorBO> createAuthorBOList(List<Author> authorList){
		List<AuthorBO> result = new ArrayList<>();
		for(Author author : authorList){
			result.add(new AuthorBO(author.getName(), author.getSurname(), author.getSecondName(), author.getBiography()));
		}
		return result;
	}
}
