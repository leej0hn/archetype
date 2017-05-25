#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2017/5/25
 * <p>Version: 1.0
 */
@Configuration
@ImportResource(locations={"classpath:/spring/dubbo-provider.xml","classpath:/spring/dubbo-consumer.xml"})
public class ConfigDubboXml {
}
