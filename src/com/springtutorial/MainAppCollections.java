package com.springtutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainAppCollections {
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		JavaCollection jc = (JavaCollection)context.getBean("javaCollection");
		
		//Use Iterator to display all content 
		for(Iterator iterator = jc.getAddressList().iterator(); iterator.hasNext();){
			Object element = iterator.next();
			System.out.println("The element is: "+element);
		}
		
		System.out.println(jc);
		jc.getAddressList();
		jc.getAddressMap();
		jc.getAddressProp();
		jc.getAddressSet();
	}
}
