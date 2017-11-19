import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author a3575 on 2017-11-18 13:57:31
 */
@SpringBootApplication
@EnableResourceServer
@EnableEurekaClient
public class ResourceServerApplication {

}
