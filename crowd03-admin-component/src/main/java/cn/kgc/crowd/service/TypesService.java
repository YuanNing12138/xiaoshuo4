package cn.kgc.crowd.service;

import cn.kgc.crowd.entity.Types;
import cn.kgc.crowd.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TypesService {

    //模糊查询
    List<Types> getTypeByName(String typename);
    //添加
    boolean saveTypes( Types types );
    //修改
    boolean updateTypes( Types types);
    //查询一个
    User getOneTypes(Integer id);
    /*删除*/
    boolean delTypes( Integer id);

}
