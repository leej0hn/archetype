#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2016/6/7
 * <p>Version: 1.0
 */
@Configuration
@ImportResource(locations={"classpath:/spring/dubbo-consumer.xml"})
public class DubboXmlConfig {
}
