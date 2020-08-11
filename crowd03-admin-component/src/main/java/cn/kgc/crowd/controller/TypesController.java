package cn.kgc.crowd.controller;

import cn.kgc.crowd.entity.Types;
import cn.kgc.crowd.entity.User;
import cn.kgc.crowd.service.TypesService;
import cn.kgc.crowd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypesController {
    @Autowired
    private TypesService typesService;

    @RequestMapping(value = "/getTypeByName")
    public List<Types> getBookByname(@RequestParam("typename") String typename) {
        System.out.println("hhhhhhhhhhhh");
        return typesService.getTypeByName(typename);
        // return xiaoshuoService.getBookByName(username);
/*修改方法*/


    }


    @RequestMapping(value = "/updateTypes")
    public  boolean updateTypes(Types types){
        return typesService.updateTypes(types);
    }

    /*增加的方法*/
    @RequestMapping(value = "/saveTypes")
    public boolean saveTypes(Types types){
        return typesService.saveTypes(types);
    }




    /*删除文档方法*/

    @RequestMapping(value = "/delTypes")
    public Boolean delTypes(@RequestParam("id") Integer id){
        return typesService.delTypes(id);
    }




    @RequestMapping(value="/getOneTypes")
    public  User getOneTypes(Integer id){
        return  typesService.getOneTypes(id);
    }

}
