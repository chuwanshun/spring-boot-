package com.cesgroup.mybatis;

import org.cesgroup.MybatisApplication;
import org.cesgroup.user.dao.UserMapper;
import org.cesgroup.user.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=MybatisApplication.class)
public class MybatisApplicationTests {
	@Autowired
	UserMapper usermapper;
	
	@Test
	public void addUserByCounttest() {
		User user = new User();
		user.setCid("e");
		user.setPid("r");
		
		usermapper.insert(user);
	}

}
