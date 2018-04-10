package dao.impl;

import dao.IDao;
import entity.User;

public class UserDao implements IDao{

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
		
		//在这里实现完整的数据库操作
		System.out.println("保存数据到数据库");
	}
	
}
