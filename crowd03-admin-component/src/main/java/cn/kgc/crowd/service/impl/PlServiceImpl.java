package cn.kgc.crowd.service.impl;

import cn.kgc.crowd.entity.Pl;
import cn.kgc.crowd.mapper.PlMapper;
import cn.kgc.crowd.service.PlService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;

@Service
public class PlServiceImpl implements PlService {

    @Autowired
    private PlMapper plMapper;

    @Override
    public List<Pl> selectByxiaoshuoid(int xiaoshuoid) {
        return plMapper.selectByxiaoshuoid(xiaoshuoid);
    }

    @Override
    public List<Pl> selectByuserid(int userid) {
        return plMapper.selectByuserid(userid);
    }

    @Override
    public Pl selectByPrimaryKey(Integer id) {
        return plMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Pl> selectA() {
        return plMapper.selectA();
    }

    @Override
    public boolean delete(Integer id) {
        return plMapper.delete(id)==1;
    }

    @Override
    public List<Map<String, Object>> queryAllPage(Integer pNo, Integer pSize) {
        PageHelper.startPage(pNo,pSize);
        return plMapper.queryAllPage(pNo,pSize);
    }

    @Override
    public boolean updataPl(Pl pl) {
        return plMapper.updataPl(pl)==1;
    }
    @Override
    public boolean addPl(Pl pl) {
        return plMapper.addPl(pl)==1;
    }

    @Override
    public Pl getOne(Integer id) {
        return plMapper.getOne(id);
    }


}
