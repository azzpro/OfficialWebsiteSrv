package com.offical.website.srv.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offical.website.srv.dao.ManagmentLoginUserDAO;
import com.offical.website.srv.pojo.ManagmentLoginUser;
import com.offical.website.srv.service.ManagmentLoginUserService;

/**
 * 
 * @author LinJian.Liu
 *
 */
@Service
public class ManagmentLoginUserServiceImpl implements ManagmentLoginUserService{

	@Autowired
	private ManagmentLoginUserDAO mDao;

	/* (non-Javadoc)
	 * @see com.offical.website.srv.service.ManagmentLoginUserService#loginManager(java.lang.String, java.lang.String)
	 */
	@Override
	public ManagmentLoginUser loginManager(String username, String password) {
		return mDao.loginManager(username, password);
	}

	/* (non-Javadoc)
	 * @see com.offical.website.srv.service.ManagmentLoginUserService#updateLoginTimeAndTimes(java.util.Date, java.lang.Long, java.lang.String)
	 */
	@Override
	public int updateLoginTimeAndTimes(Date time, String name) {
		return mDao.updateLoginTimeAndTimes(time, name);
	}
	
	/*@Override
	public Manager loginManager(String username, String password) {
		return mDao.loginManager(username, password);
	}

	@Override
	public int insert(Manager manager) {
		return mDao.insert(manager);
	}

	@Override
	public int update(Manager manager) {
		return mDao.update(manager);
	}

	@Override
	public List<Manager> selectAllManager() {
		return mDao.selectAllManager();
	}

	@Override
	public List<Manager> selectManager(String key, int pageindex, int pagesize) {
		pageindex = pageindex+1;
		return mDao.selectManager(key,(pageindex-1)*pagesize,pagesize);
	}

	@Override
	public Manager selectManagerById(String id) {
		return mDao.selectManagerById(id);
	}

	@Override
	public void deleteManager(int[] ids) {
		mDao.deleteManager(ids);
	}

	@Override
	public int getCount(String key) {
		return mDao.getCount(key);
	}

	@Override
	public int check(String n) {
		return mDao.check(n);
	}

	@Override
	public int updatePwd(String pwd, String name) {
		return mDao.updatePwd(pwd, name);
	}

	@Override
	public int updatePwdByPhone(String pwd, String p) {
		return mDao.updatePwdByPhone(pwd, p);
	}
*/

}
