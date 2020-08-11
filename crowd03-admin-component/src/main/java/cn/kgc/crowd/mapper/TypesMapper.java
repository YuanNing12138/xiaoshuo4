package cn.kgc.crowd.mapper;

import cn.kgc.crowd.entity.Types;
import cn.kgc.crowd.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TypesMapper {
    //模糊查询
    List<Types> getTypeByName(@Param("typename") String typename);
    //添加
    Integer saveTypes(@Param("types") Types types );
    //修改
    Integer updateTypes(@Param("types") Types types);
    //查询一个
    User getOneTypes(@Param("id") Integer id);
    /*删除*/
    Integer delTypes(@Param("id") Integer id);

}
