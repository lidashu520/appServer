package com.imooc.service.impl;

import com.imooc.mapper.PlatUserMapper;
import com.imooc.pojo.PlatUser;
import com.imooc.service.PlatUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

@Service
public class PlatUserServiceImpl implements PlatUserService {
    @Autowired
    private PlatUserMapper platUserMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveUser(PlatUser platUser) {
       platUserMapper.insert(platUser);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateUser(PlatUser platUser) {
       platUserMapper.updateByPrimaryKey(platUser);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteUser(String Id) {
        platUserMapper.deleteByPrimaryKey(Id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public PlatUser queryUserById(String Id) {
        return platUserMapper.selectByPrimaryKey(Id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<PlatUser> queryUserList(PlatUser platUser) {
        Example example = new Example(PlatUser.class);
        Example.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotBlank(platUser.getPhone())) {
            criteria.andEqualTo("phone",platUser.getPhone());
        }
        List<PlatUser> userList = platUserMapper.selectByExample(example);
        return userList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public PlatUser queryUserByPhone(String phone) {
        return platUserMapper.queryUserByPhone(phone);
    }
}
