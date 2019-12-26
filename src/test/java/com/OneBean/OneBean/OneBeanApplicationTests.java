package com.OneBean.OneBean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OneBeanApplicationTests {
//	@Autowired
//	private ChildService childService;
	@Autowired
	private ParentService<String> stringParentService;

	@Test
	public void contextLoads() {
//		System.out.println(childService == stringParentService);
		System.out.println( stringParentService);
	}

}
