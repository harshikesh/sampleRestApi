package application;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import resources.EmployeeResource;

/**
 * Created by harshikesh.kumar on 07/08/17.
 */
public class RestApiExampleApplication extends Application<RestApiExampleConfiguration> {

    //This is for logging in log file.
    private static final Logger LOGGER = LoggerFactory.getLogger(RestApiExampleApplication.class);


    public void run(RestApiExampleConfiguration restApiExampleConfiguration, Environment env) throws Exception {

        LOGGER.info("Registering REST resources");
        env.jersey().register(new EmployeeResource(restApiExampleConfiguration));
    }

    public static void main(String[] args) throws Exception {
        new RestApiExampleApplication().run(args);
    }
}
