#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.persistence.mapper;

import ${package}.common.model.TestModel;
import ${package}.persistence.BaseDaoTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2017/3/9
 * <p>Version: 1.0
 */
public class TestModelMapperTest extends BaseDaoTest {
    @Autowired
    TestModelMapper mapper;

    @Test
    public void test() throws Exception{
        TestModel model = new TestModel();
        model.setAge(18);
        model.setName("Lee John");
        mapper.insert(model);
    }
}
