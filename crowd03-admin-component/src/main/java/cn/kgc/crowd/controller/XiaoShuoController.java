package cn.kgc.crowd.controller;

import cn.kgc.crowd.entity.Xiaoshuo;
import cn.kgc.crowd.service.XiaoshuoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;


@RestController
public class XiaoShuoController {
    @Autowired
    private XiaoshuoService xiaoshuoService;

    @RequestMapping(value = "/deleteB")
    public boolean deleteBook(@RequestParam("id") Integer id){
        return xiaoshuoService.deletexiaoshuo(id);
    }

    //添加
    @RequestMapping("/addBookABC")
    public boolean addBook(Xiaoshuo xiaoshuo){
        System.out.println("添加成功");
        return xiaoshuoService.addxiaoshuo(xiaoshuo);
    }

    @RequestMapping(value = "/getBookByname")
    public List<Xiaoshuo> getBookByname(@RequestParam("name") String name){
        System.out.println("hhhhhhhhhhhh");
        return xiaoshuoService.getBookByName(name);
    }
}
