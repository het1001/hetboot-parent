package com.het.boot;

import com.het.boot.dao.UserMapper;
import com.het.boot.dao.entity.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
        UserDO userDO = new UserDO();
        userDO.setAccount("test222");
        userDO.setAreaZone("杭州");
        userDO.setBizZoneId(2L);
        userDO.setEntryDate(new Date());
        userDO.setRealName("白唤琴");
        userDO.setSex("女");
        userDO.setPhone("15888861560");
        userDO.setWorkId("WB&*&*&*");
        userDO.setPassWord("123456");
        userDO.setState("NORMAL");
        userDO.setDomain("ALIPAY");

        userMapper.insert(userDO);
    }

}

