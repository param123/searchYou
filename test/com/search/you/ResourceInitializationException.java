package com.search.you;

public class ResourceInitializationException extends RuntimeException {
	
	public ResourceInitializationException(String message){
		super(message);
	}
	
	public ResourceInitializationException(Throwable t){
		super(t);
	}

}
