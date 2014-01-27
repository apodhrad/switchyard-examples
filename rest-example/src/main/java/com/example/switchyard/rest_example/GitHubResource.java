package com.example.switchyard.rest_example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

public interface GitHubResource {

	@GET
	@Path("users/{name}")
	@Produces({ "application/json" })
	public Response getPerson(@PathParam("name") String name);
}
