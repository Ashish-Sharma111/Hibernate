package com.demo.test;

import java.util.Scanner;

import com.demo.service.UserService;
import com.demo.service.UserserviceImpl;

public class TestCrudDemo {

	public static void main(String[] args) {
		int choice=0;
      Scanner sc=new Scanner(System.in);
      UserService uservice=new UserserviceImpl();
      
      do {
    	  System.out.println("1.Add new User \n2.DisplayAll \n3. display by id");
    	  System.out.println("4.delete by id \n5.update by id \n6. sort by id\7. exit");
    	  System.out.println("choice : ");
    	  choice=sc.nextInt();
    	  switch(choice) {
    	  
    	  case 1: uservice.addnewUser();
    	         break;
    	  case 2:
    		  break;
    	  case 3:
    		  break;
    	  case 4:
    		  break;
    	  case 5:
    		  break;
    	  case 6:
    		  break;
    	  case 7:
    		  uservice.closeMySessionFactory();
				System.out.println("Thank you for visiting......");
    		  break;
    	  default:
    		  System.out.println("wrong choice");
    		  break;
    	  
    	  
    	  }
      }while(choice!=7);
      
	}

}
