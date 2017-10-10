package com.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyServerRemote extends Remote{
	public String getMessage() throws RemoteException;
}
