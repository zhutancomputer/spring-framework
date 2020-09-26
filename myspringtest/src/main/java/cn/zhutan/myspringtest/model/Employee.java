package cn.zhutan.myspringtest.model;

public class Employee {
	private String username;
	private String password;

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

	@Override
	public String toString() {
		return "Employee{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
