package cn.kgc.crowd.service.impl;

import cn.kgc.crowd.entity.Types;
import cn.kgc.crowd.entity.User;
import cn.kgc.crowd.mapper.TypesMapper;
import cn.kgc.crowd.mapper.UserMapper;
import cn.kgc.crowd.service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypesServiceImpl  implements  TypesService {
    @Autowired
    private TypesMapper typesMapper;



    @Override
    public List<Types> getTypeByName(String typename) {
        return typesMapper.getTypeByName("%"+typename+"%");
    }

    @Override
    public boolean saveTypes(Types types) {
        return typesMapper.saveTypes(types)==1;
    }

    @Override
    public boolean updateTypes(Types types) {
        return typesMapper.updateTypes(types)==1;
    }

    @Override
    public User getOneTypes(Integer id) {
        return typesMapper.getOneTypes(id);
    }

    @Override
    public boolean delTypes(Integer id) {
        return typesMapper.delTypes(id)==1;
    }
}
