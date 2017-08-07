package application;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by harshikesh.kumar on 07/08/17.
 */
public class RestApiExampleConfiguration extends Configuration {


    String message = null;

    public String getMessage() {
        return message;
    }

}
