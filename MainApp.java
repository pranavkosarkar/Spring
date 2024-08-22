package com.pranav.demos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
//		Account ref= (Account)ctx.getBean("act");
//	    ref.withdraw(1234);
//	    
//	    Account obj =(Account)ctx.getBean("act");
//	    if(ref==obj)
//	    	System.out.println("Same");
//	    else
//	    	System.out.println("Different");
	    
	}
}
// When the scope will be singleton to moment the xml file is loaded the object will be created.
// There is no need to give  getBean() explicitly.
// As many beans present in the xml file as many object will be created by default.
