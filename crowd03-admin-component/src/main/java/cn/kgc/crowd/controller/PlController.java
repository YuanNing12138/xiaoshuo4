package cn.kgc.crowd.controller;


import cn.kgc.crowd.entity.Pl;
import cn.kgc.crowd.service.PlService;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.management.snmp.AdaptorBootstrap;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;

@RestController
public class PlController {
    @Autowired
    private PlService plService;
    @RequestMapping("/queryAllPage")
   public String queryAllPage(Model model,
                              @RequestParam(defaultValue = "1")Integer pNo,
                              @RequestParam(defaultValue = "3")Integer pSize){
        List<Map<String, Object>> list=plService.queryAllPage(pNo,pSize);
        PageInfo<Map<String, Object>> plPageInfo= new PageInfo<>(list);
        model.addAttribute("pageInfo",plPageInfo);
        return "product-list";
    }

    @RequestMapping(value = "/selectByxiaoshuoid")
    public List<Pl> selectByxiaoshuoid(@RequestParam("xiaoshuoid") int xiaoshuoid){
        return plService.selectByxiaoshuoid(xiaoshuoid);
    }

    @RequestMapping(value = "/selectByuserid")
    public List<Pl> selectByuserid(@RequestParam("userid") int userid){

        return plService.selectByuserid(userid);
    }

    @RequestMapping(value = "/selectA")
    public List<Pl> selectAll(){
        return plService.selectA();
    }

    @RequestMapping(value = "/delete")
    public boolean delete(@RequestParam("id") Integer id){
        return plService.delete(id);
    }
    @RequestMapping("/updataPl")
    public boolean updataPl(Pl pl){
        return plService.updataPl(pl);
    }
    @RequestMapping("/addPl")
    public boolean addPl(Pl pl){
        return plService.addPl(pl);
    }
    @RequestMapping(value = "/getone")
    public Pl getone(@RequestParam("id") Integer id){

        return plService.getOne(id);
    }

}
