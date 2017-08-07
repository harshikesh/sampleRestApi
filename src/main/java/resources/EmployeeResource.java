package resources;

import application.RestApiExampleConfiguration;

import javax.validation.Validator;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by harshikesh.kumar on 07/08/17.
 */


@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)


public class EmployeeResource {

    RestApiExampleConfiguration configuration;

    public EmployeeResource(RestApiExampleConfiguration restApiExampleConfiguration) {
        configuration = restApiExampleConfiguration;
    }

    @GET
    @Path("/{id}")
    public Response getEmployeeById(@PathParam("id") Integer id) {

        String employee = configuration.getMessage();
        if (employee != null)
            return Response.ok(employee).build();
        else
            return Response.status(Response.Status.NOT_FOUND).build();
    }

}
