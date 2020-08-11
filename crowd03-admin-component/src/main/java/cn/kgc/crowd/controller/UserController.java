package cn.kgc.crowd.controller;

import cn.kgc.crowd.entity.User;
import cn.kgc.crowd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/getNameandPassword")
    public User getNameandPassword(User user) {
        System.out.println("jjjjjj");
        return getNameandPassword(user);
    }



    @RequestMapping(value = "/getUserByname")
    public List<User> getBookByname(@RequestParam("username") String username) {
        System.out.println("hhhhhhhhhhhh");
        return userService.getUserByName(username);
        // return xiaoshuoService.getBookByName(username);
/*修改方法*/


    }


        @RequestMapping(value = "/updateUser")
        public  boolean updateUser(User user){
            return userService.updateUser(user);
        }

    /*增加的方法*/
        @RequestMapping(value = "/saveUser")
        public boolean saveUser(User user){
            return userService.saveUser(user);
        }




    /*删除文档方法*/

        @RequestMapping(value = "/delUser")
        public Boolean delUser(@RequestParam("id") Integer id){
            return userService.delUser(id);
        }




    @RequestMapping(value="/getOne")
    public  User getOne(Integer id){
        return  userService.getOne(id);
    }
}
