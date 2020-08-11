package cn.kgc.crowd.service;

import cn.kgc.crowd.entity.Xiaoshuo;

import java.util.List;

public interface XiaoshuoService {
    /*删除*/
    boolean deletexiaoshuo(Integer id);
    //模糊查询
    List<Xiaoshuo> getBookByName(String name);
     //修改
    boolean updata(Xiaoshuo xiaoshuo);
    //查询一个
    Xiaoshuo getOne(Integer id);
    //添加
    boolean addxiaoshuo(Xiaoshuo xiaoshuo);

}
