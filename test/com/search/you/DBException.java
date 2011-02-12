package com.search.you;

public class DBException extends RuntimeException {
	
	public DBException(Throwable t){
		super(t);
	}
	
	public DBException(String message,Throwable t){
		super(message, t);
	}

}
