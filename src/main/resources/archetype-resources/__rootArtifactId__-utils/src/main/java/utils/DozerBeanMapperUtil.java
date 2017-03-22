#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.utils;

import com.google.common.collect.Lists;
import org.dozer.DozerBeanMapper;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2016/12/15
 * <p>Version: 1.0
 */
public class DozerBeanMapperUtil {
    private static DozerBeanMapper dozer = new DozerBeanMapper();

    /**
     * 构造新的destinationClass实例对象，通过source对象中的字段内容
     * 映射到destinationClass实例对象中，并返回新的destinationClass实例对象。
     *
     * @param source 源数据对象
     * @param destinationClass 要构造新的实例对象Class
     */
    public static <T> T map(Object source, Class<T> destinationClass)
    {
        return dozer.map(source, destinationClass);
    }



    public static <T> List<T> mapList(Collection sourceList, Class<T> destinationClass)
    {
        List destinationList = Lists.newArrayList();
        for (Iterator i${symbol_dollar} = sourceList.iterator(); i${symbol_dollar}.hasNext(); ) { Object sourceObject = i${symbol_dollar}.next();
            Object destinationObject = dozer.map(sourceObject, destinationClass);
            destinationList.add(destinationObject);
        }
        return destinationList;
    }


    /**
     * 将对象source的所有属性值拷贝到对象destination中.
     *
     * @param source 对象source
     * @param destinationObject 对象destination
     */
    public static void copy(Object source, Object destinationObject)
    {
        dozer.map(source, destinationObject);
    }
}
