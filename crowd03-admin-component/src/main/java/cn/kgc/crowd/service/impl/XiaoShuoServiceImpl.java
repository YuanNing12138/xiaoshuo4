package cn.kgc.crowd.service.impl;

import cn.kgc.crowd.entity.Xiaoshuo;
import cn.kgc.crowd.entity.XiaoshuoExample;
import cn.kgc.crowd.mapper.XiaoshuoMapper;
import cn.kgc.crowd.service.XiaoshuoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class XiaoShuoServiceImpl implements XiaoshuoService {


    @Autowired
    private XiaoshuoMapper xiaoshuoMapper;
   /* 删除*/
    @Override
    public boolean deletexiaoshuo(Integer id) {
        return xiaoshuoMapper.deletexiaoshuo(id)==1;
    }

    @Override
    public List<Xiaoshuo> getBookByName(String name) {
        return xiaoshuoMapper.getBookByName("%"+name+"%");
    }

    @Override
    public boolean updata(Xiaoshuo xiaoshuo) {
        return xiaoshuoMapper.updata(xiaoshuo)==1;
    }

    @Override
    public Xiaoshuo getOne(Integer id) {
        return xiaoshuoMapper.getOne(id);
    }

    @Override
    public boolean addxiaoshuo(Xiaoshuo xiaoshuo) {
        return xiaoshuoMapper.addXiaoShuo(xiaoshuo)==1;}

}
