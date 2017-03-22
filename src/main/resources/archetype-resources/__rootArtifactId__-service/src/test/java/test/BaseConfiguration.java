#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


/**
 * Created by MHL on 16/4/8.
 */
@Configuration
@EnableAutoConfiguration
//@ComponentScan(
//        basePackages = {"${package}"}
//
//)
//@MapperScan("${package}.persistence.mapper")
@ImportResource(locations={"classpath:dubbo-consumer.xml"})
public class BaseConfiguration {
}
