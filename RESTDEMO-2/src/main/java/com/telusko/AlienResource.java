package com.telusko;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/aliens")
public class AlienResource {
	AlienRepository repo = new AlienRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAllAliens() {
		System.out.println("this is Alien resource");
		List<Alien> list = repo.getAll();
		System.out.println("All alien-----"+list);
		return list;
	}
	
	
	
	@GET
	@Path("/getby/{id}")
	@Consumes(MediaType.APPLICATION_XML)
	public Alien getById(@PathParam("id") int id) {
		System.out.println("getAlien by--"+id);
		return repo.getAlienById(id);
	}
	
	@POST
	@Path("/postaliens")
	public Alien putAlien(Alien a) {
		System.out.println("/postaliens called");
		repo.createAlien(a);
		System.out.println("new alien adde ===");
		return a;
	}
}
