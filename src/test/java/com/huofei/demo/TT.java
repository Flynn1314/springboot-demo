package com.huofei.demo;

import com.huofei.demo.entity.OtherInfo;
import com.huofei.demo.entity.Thirdinfo;
import com.huofei.demo.entity.User;
import com.huofei.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * description:
 * date: 2020/11/9 20:06
 * author: huofei
 * version: 1.0
 */
@SpringBootTest
public class TT {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test() {

//        User Jone = userMapper.selectById(1);
//        System.err.println(Jone.getName());

//        Thirdinfo thirdinfo=new Thirdinfo();
//        thirdinfo.setAge(1);
//        OtherInfo otherInfo= new OtherInfo();
//        otherInfo.setThirdinfo(thirdinfo);
//        User user=new User();
//        user.setId(12L);
//        user.setOtherInfo(otherInfo);
//        userMapper.insert(user);
        User Jone = userMapper.selectById(12L);
        System.err.println(Jone.getOtherInfo().getThirdinfo().getAge());
    }
}

