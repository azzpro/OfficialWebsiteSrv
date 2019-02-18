package com.offical.website.srv.service;

import java.util.Date;

import com.offical.website.srv.pojo.ManagmentLoginUser;

/**
 * @author THINK
 * 后台管理service
 */
public interface ManagmentLoginUserService {
	
	/**
	 * 根据用户名和密码查询用户
	 * @param username
	 * @param password
	 * @return
	 */
	ManagmentLoginUser loginManager(String username,String password);
	
	
	/**
	 * 更新登录时间以及登录次数 
	 * @param time
	 * @param times
	 * @param name
	 * @return
	 */
	int updateLoginTimeAndTimes(Date time,String name);
	/*int updatePwd(String pwd,String name);
	
	int updatePwdByPhone(String pwd,String p);
 
	int insert(Manager manager);
	
	int update(Manager manager);
	
	List<Manager> selectAllManager();
	
	List<Manager> selectManager(String key,int pageindex, int pagesize);
	
	Manager selectManagerById(String id);
	
	void deleteManager(int[] ids);
	
	int getCount( String key);
	
	int check( String n);
	
	Manager loginManager(String username,String password);*/
}
