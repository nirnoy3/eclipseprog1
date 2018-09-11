package com.driver.main;

import org.testng.annotations.Test;

import com.dataRead.DataRead;
import com.utility.Functionality;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterMethod;

public class MainCaller {
	DataRead dr = new DataRead();
	Functionality fn = new Functionality();
	
	String arr[][] = new String[100][];
	String arr1[][] = new String[100][];
	String arr2[][] = new String[100][];

	@Test
	  public void f() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
	         //MainCaller ob = new MainCaller();
	         Method[] methods = Functionality.class.getDeclaredMethods();
	         try{arr = dr.getData(0);}catch(IOException i) {}
	           
	         
	         
	         for(int i = 0 ; i < 6 ; i++) {
	                System.out.println("met : "+arr[i][0]);
	                
	                if(arr[i][0].equalsIgnoreCase("login")) {
	                       login();
	                }
	                else {
	                for(int j = 0 ; j < methods.length ; j++) {
	                       System.out.println("Method Name = "+methods[j].getName());
	                             if(arr[i][0].equalsIgnoreCase(methods[j].getName()) ) {
	                                    
	                                    System.out.println("Check"+arr[i][0]+"================="+methods[j].getName());
	                                    methods[j].invoke(fn,arr[i][1],arr[i][2],arr[i][3]);
	                                    break;
	                             }
	                       }
	                }
	   }
	  }  
	
@Test
  public void f1() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
	  
	  Method[] methods2 = Functionality.class.getDeclaredMethods();
	  try{
		  arr2 = dr.getDataTestCase2(1);
		  }
	  catch(IOException i) {}
	  for(int i = 0 ; i < 12 ; i++) {
		  System.out.println("Met : "+arr2[i][0]);
		  
		  if(arr2[i][0].equalsIgnoreCase("login")) {
			  login();
		  }
		  else {
		  for(int j = 0 ; j < methods2.length ; j++) {
			  System.out.println("Method Name = "+methods2[j].getName());
				  if(arr2[i][0].equalsIgnoreCase(methods2[j].getName()) ) {
					  
					  System.out.println("Check"+arr2[i][0]+"================="+methods2[j].getName());
					  methods2[j].invoke(fn,arr2[i][1],arr2[i][2],arr2[i][3]);
					  break;
				  }
			  }
		  }
	  }
	 
  }
  
  public void login() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
	  
	  
	  Method[] methods1 = Functionality.class.getDeclaredMethods();
	  try{arr1 = dr.getDatalogin(2);}catch(IOException ex) {}
	  System.out.println("logininin");
	  System.out.println("Methods array=================================");
	  for(Method m : methods1) {
		  System.out.println(m.getName());
	  }
	  System.out.println("simple array=================================");
	  for(int i = 0 ; i<4;i++) {
		  System.out.println(arr1[i][0]+" "+arr1[i][1]+" "+arr1[i][2]+" "+arr1[i][3]);
	  }
		  for(int itr =0;itr<4;itr++) {
		  
			  for(int j = 0 ; j < methods1.length ; j++) {
				  if(arr1[itr][0].equalsIgnoreCase(methods1[j].getName())) {
					  System.out.println("Check "+arr1[itr][0]+"================="+methods1[j].getName());
					  methods1[j].invoke(fn,arr1[itr][1],arr1[itr][2],arr1[itr][3]);
					  break;
				  }
			  }
		  
		  }
		  
	  }
  
	  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Started");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  try {Thread.sleep(2000);}catch(InterruptedException ex) {}
	  
  }

}
