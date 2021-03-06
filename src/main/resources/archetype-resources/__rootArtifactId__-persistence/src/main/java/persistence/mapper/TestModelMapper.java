#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.persistence.mapper;

import ${package}.common.model.TestModel;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2017/3/9
 * <p>Version: 1.0
 */
@Mapper
public interface TestModelMapper {

    void insert(TestModel model);
}
