package cn.kgc.crowd.service;

import cn.kgc.crowd.entity.Pl;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.access.method.P;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;

public interface PlService {
    //xiaoshuoid找Pl
    List<Pl> selectByxiaoshuoid(int xiaoshuoid) ;
    //userid找Pl
    List<Pl> selectByuserid(int userid) ;
    //id找pl
    Pl selectByPrimaryKey(Integer id);
    List<Pl> selectA();
    boolean delete(Integer id);
    List<Map<String, Object>> queryAllPage(Integer pNo, Integer pSize);
    boolean updataPl(Pl pl);
    boolean addPl(Pl pl);
    Pl getOne(Integer id);



}
