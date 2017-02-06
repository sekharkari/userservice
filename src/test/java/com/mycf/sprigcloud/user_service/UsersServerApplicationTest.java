package com.mycf.sprigcloud.user_service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.boot.SpringApplication;

@RunWith(PowerMockRunner.class)
@PrepareForTest(SpringApplication.class)

public class UsersServerApplicationTest {

	@Test
	public void test() throws Exception {
		String[] args = new String[1];
		PowerMockito.mockStatic(SpringApplication.class);
		//PowerMockito.spy(SpringApplication.class);
		//PowerMockito.doNothing().when(SpringApplication.class, "run",UsersServerApplication.class, args);

		PowerMockito.when(SpringApplication.run(UsersServerApplication.class, args)).thenReturn(null);
		UsersServerApplication.main(args);
		PowerMockito.verifyStatic();
	}

}
