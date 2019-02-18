package com.offical.website.srv.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author THINK
 * 管理后台登录用户
 */
public class ManagmentLoginUser implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 294157672446892758L;
	private Long id;
	private String username;
	private String password;
	private Byte status;
	private Date ctime;
	private String phone;
	private String email;
	private Byte gender;
	private Date lastLoginTime;
	private Long loginTimes;
	
	public ManagmentLoginUser() {
	}
	
	public ManagmentLoginUser(Long id, String username, String password, Byte status, Date ctime, String phone,
			String email, Byte gender, Date lastLoginTime, Long loginTimes) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.status = status;
		this.ctime = ctime;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.lastLoginTime = lastLoginTime;
		this.loginTimes = loginTimes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Byte getGender() {
		return gender;
	}
	public void setGender(Byte gender) {
		this.gender = gender;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public Long getLoginTimes() {
		return loginTimes;
	}
	public void setLoginTimes(Long loginTimes) {
		this.loginTimes = loginTimes;
	}
	
	public static class ManagmentLoginUserBuilder {
		 
		private Long id;
		private String username;
		private String password;
		private Byte status;
		private Date ctime;
		private String phone;
		private String email;
		private Byte gender;
		private Date lastLoginTime;
		private Long loginTimes;
 
		public ManagmentLoginUserBuilder setId(Long id) {
			this.id = id;
			return this;
		}
		public ManagmentLoginUserBuilder setUsername(String username) {
			this.username = username;
			return this;
		}
		public ManagmentLoginUserBuilder setPassword(String password) {
			this.password = password;
			return this;
		}
		public ManagmentLoginUserBuilder setStatus(Byte status) {
			this.status = status;
			return this;
		}
		public ManagmentLoginUserBuilder setCtime(Date ctime) {
			this.ctime = ctime;
			return this;
		}
		public ManagmentLoginUserBuilder setPhone(String phone) {
			this.phone = phone;
			return this;
		}
		public ManagmentLoginUserBuilder setEmail(String email) {
			this.email = email;
			return this;
		}
		public ManagmentLoginUserBuilder setGender(Byte gender) {
			this.gender = gender;
			return this;
		}
		public ManagmentLoginUserBuilder setLastLoginTime(Date lastLoginTime) {
			this.lastLoginTime = lastLoginTime;
			return this;
		}
		public ManagmentLoginUserBuilder setLoginTimes(Long loginTimes) {
			this.loginTimes = loginTimes;
			return this;
		}
        public ManagmentLoginUser build(){
        	return new ManagmentLoginUser(id, username, password, status, ctime, phone, email, gender, lastLoginTime, loginTimes);
        }
    }

}
