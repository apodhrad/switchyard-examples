package org.apodhrad.switchyard.example.bean_rest_simple;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/bye")
public interface Bye {

	@GET
	@Path("/{name}")
	String sayBye(@PathParam("name") String name);
}
