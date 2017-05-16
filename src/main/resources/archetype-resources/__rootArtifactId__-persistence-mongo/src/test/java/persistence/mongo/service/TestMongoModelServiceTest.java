#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.persistence.mongo.service;

import ${package}.BaseDaoTest;
import ${package}.common.model.mongo.TestMongoModel;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2016/9/1
 * <p>Version: 1.0
 */
public class TestMongoModelServiceTest extends BaseDaoTest {
    @Autowired
    TestMongoModelService service;

    @Test
    public void testSave(){
        TestMongoModel mongoModel = new TestMongoModel();
        mongoModel.setName("Lee");
        mongoModel.setAge(18);
        service.save(mongoModel);
    }

}
