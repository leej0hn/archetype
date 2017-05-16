#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import ${package}.persistence.mongo.repository.impl.SimpleCustomerRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan(
        basePackages = {
                "${package}"
        }
)
@EnableMongoRepositories(repositoryBaseClass = SimpleCustomerRepository.class)
public class BaseConfiguration {
}
