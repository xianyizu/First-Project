package biz.impl;

import biz.IUserBiz;
import dao.IDao;
import entity.User;

public class UserBiz implements IUserBiz{
	
	private IDao dao;
	
	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}
	
	@Override
	public void addNewUser(User user) {
		// TODO Auto-generated method stub
		dao.save(user);
	}

	
	
}
