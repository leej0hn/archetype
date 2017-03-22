#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.impl;

import ${package}.common.vo.Response;
import ${package}.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2017/3/21
 * <p>Version: 1.0
 */
@Service
@Slf4j
public class TestServiceImpl implements TestService{

    public TestServiceImpl(){
        log.info("TestServiceImpl constructor");
    }


    @Override
    public Response<String> test(String params1) {
        return Response.ok("Test OK");
    }

}
