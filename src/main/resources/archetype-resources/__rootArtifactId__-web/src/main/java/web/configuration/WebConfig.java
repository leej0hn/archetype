#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2016/6/7
 * <p>Version: 1.0
 */
@Component
@ConfigurationProperties(prefix="web")
@Data
public class WebConfig {
    private String ips;
}
