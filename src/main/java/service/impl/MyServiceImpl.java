package service.impl;

import service.MyService;

public class MyServiceImpl implements MyService {

	public int volidLogin(String username, String pass) {
		// TODO Auto-generated method stub
		if(username.equals("test")&&pass.equals("123")) return 99;
		return -1;
	}

}
