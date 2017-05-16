#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.persistence.mongo.dao;

import ${package}.common.model.mongo.TestMongoModel;
import ${package}.persistence.mongo.repository.CustomerRepository;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2016/8/4
 * <p>Version: 1.0
 */
public interface TestMongoModelDao extends CustomerRepository<TestMongoModel, String> {

}
