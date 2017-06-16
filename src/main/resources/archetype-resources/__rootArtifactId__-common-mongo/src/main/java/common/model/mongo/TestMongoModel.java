#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common.model.mongo;

import ${package}.common.model.mongo.base.MongoBaseModel;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2017/5/16
 * <p>Version: 1.0
 */
@Data
@Document(collection="test_mongo_model")
public class TestMongoModel extends MongoBaseModel implements Serializable {
    private static final long serialVersionUID = -8076172584935324393L;

    private String name;
    private int age;
}
