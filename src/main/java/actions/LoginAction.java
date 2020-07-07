package actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import service.MyService;

public class LoginAction extends ActionSupport {
	
	private String username;
	private String password;
	private MyService ms;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public MyService getMs() {
		return ms;
	}
	public void setMs(MyService ms) {
		this.ms = ms;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(getUsername()+":"+getPassword());
		if(ms.volidLogin(getUsername(), getPassword())>0) {
//			ActionContext.getContext().getSession().put("username", getUsername());
			addActionMessage("登录成功，欢迎您！");
			return SUCCESS;
		}
		return ERROR;
	}

}
