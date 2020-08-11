package cn.kgc.crowd.mapper;

import cn.kgc.crowd.entity.User;
import cn.kgc.crowd.entity.Xiaoshuo;
import org.apache.ibatis.annotations.Param;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserMapper {
    //模糊查询
    List<User> getUserByName(@Param("username") String username);
    //添加
    Integer saveUser(@Param("user") User user );
    //修改
    Integer updateUser(@Param("user") User user);
    //查询一个
   User getOne(@Param("id") Integer id);
    /*删除*/
   Integer delUser(@Param("id") Integer id);
    /*管理员登录方法*/
    User getUsersNamePassword(@Param("user")User user);

}
