package com.example;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyServer implements MyServerRemote {

	private static String message = "hello im2ag! ";

	
	
	public String getMessage() throws RemoteException  {
		return message;
	}

	public static void main(String args[]) throws Exception {
		System.out.println("RMI server started ! ");
		MyServer obj = new MyServer();
		try {
			MyServerRemote stub = (MyServerRemote) UnicastRemoteObject.exportObject(obj, 0);
			Registry reg;
			try {
				reg = LocateRegistry.createRegistry(1099);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				reg = LocateRegistry.getRegistry();
			}
			reg.rebind("MyServer", stub);
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
