import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import biz.IUserBiz;
import entity.User;

public class Text {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"beans.xml");
		IUserBiz userBiz = (IUserBiz) ctx.getBean("userBiz");
		
		User user = new User();
		user.setEmail("sdsa");
		user.setId(1);
		user.setPassword("asdfd");
		user.setUsername("bond");
		userBiz.addNewUser(user);
		//aspectj ÎÄ¼þ ºÍ  aop
	}
}
