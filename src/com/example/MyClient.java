package com.example;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
	 public static void main(String args[]) throws Exception {
	        Registry registry = LocateRegistry.getRegistry("localhost");
	        MyServerRemote obj = (MyServerRemote) registry.lookup("MyServer");
	        System.out.println(obj.getMessage()); 
	    }
}
