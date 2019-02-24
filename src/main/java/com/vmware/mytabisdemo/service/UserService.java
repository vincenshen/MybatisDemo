package com.vmware.mytabisdemo.service;

import com.vmware.mytabisdemo.dao.UserDOMapper;
import com.vmware.mytabisdemo.dataobject.UserDO;
import com.vmware.mytabisdemo.viewobject.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserDOMapper userDOMapper;

    public UserVO getUserById(Integer id){
        UserDO userDO = userDOMapper.selectByPrimaryKey(id);
        System.out.println(userDO);
        if(userDO == null){
            return null;
        }

        UserVO userVO = new UserVO();

        BeanUtils.copyProperties(userDO, userVO);
        return userVO;
    }

}
