#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.impl;

import ${package}.common.model.mongo.TestMongoModel;
import ${package}.common.vo.Response;
import ${package}.persistence.mongo.service.TestMongoModelService;
import ${package}.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
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

    //注意：1.5.3 spring boot 后，mongodb+dubbo整合，会涉及到bean依赖循环的异常，需要加lazy注解
    @Autowired
    @Lazy
    private TestMongoModelService testMongoModelService;

    public TestServiceImpl(){
        log.info("TestServiceImpl constructor");
    }


    @Override
    public Response<String> test(String params1) {
        TestMongoModel mongoModel = new TestMongoModel();
        mongoModel.setAge(1);
        mongoModel.setName("name");
        testMongoModelService.save(mongoModel);
        return Response.ok();
    }

}
