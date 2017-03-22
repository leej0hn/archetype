#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.persistence;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;


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
public class BaseConfiguration {
}
