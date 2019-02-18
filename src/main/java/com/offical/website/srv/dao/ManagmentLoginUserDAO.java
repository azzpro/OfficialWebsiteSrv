package com.offical.website.srv.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.offical.website.srv.pojo.ManagmentLoginUser;


/**
 * @author THINK
 * 后台管理DAO
 */
@Mapper
public interface ManagmentLoginUserDAO {
	
	/**
	 * 根据用户名和密码查询用户
	 * @param username
	 * @param password
	 * @return
	 */
	ManagmentLoginUser loginManager(@Param("username") String username,@Param("password") String password);
	
	/**
	 * 更新登录时间以及登录次数 
	 * @param time
	 * @param times
	 * @param name
	 * @return
	 */
	int updateLoginTimeAndTimes(@Param("time") Date time,@Param("name") String name);
	
	/*int updatePwd(@Param("pwd") String pwd,@Param("name") String name);
	
	int updatePwdByPhone(@Param("pwd") String pwd,@Param("p") String p);
	
	int insert(Manager manager);
	
	int update(Manager manager);
	
	List<Manager> selectAllManager();
	
	List<Manager> selectManager(@Param("key") String key,@Param("pageindex") int pageindex,@Param("pagesize") int pagesize);
	
	Manager selectManagerById(String id);
	
	void deleteManager(int[] ids);
	
	int getCount(@Param("key") String key);
	
	int check(@Param("n") String n);
	
	Manager loginManager(@Param("username") String username,@Param("password") String password);*/
}
