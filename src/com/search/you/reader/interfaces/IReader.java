package com.search.you.reader.interfaces;

import com.search.you.processor.interfaces.IProcessor;

public interface IReader {
	
	public void init();
	
	public void read(IProcessor processor);
	

}
