package br.com.edigleison.estudos.soa.services.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.edigleison.estudos.soa.model.User;
import br.com.edigleison.estudos.soa.services.UsersService;

public class UserServiceRest implements UsersService{

	private List<User> users = new ArrayList<User>();
	
	
	@Override
	public Response getUsers() {
		if(users.isEmpty()){
			return Response.status(Status.NOT_FOUND).build();
		}
		
		return Response.ok(users).build();
	}

}
