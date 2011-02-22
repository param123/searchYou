package com.search.you.fatories;

import java.util.Hashtable;

import com.search.you.processor.interfaces.IProcessor;

public class ProcessorFactory {

	private static Hashtable<String, IProcessor> processorTable = new Hashtable<String, IProcessor>();

	public static IProcessor getProcessor(Class clazz)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		IProcessor processor = processorTable.get(clazz.getName());
		if (processor == null) {
			synchronized (processorTable) {
				if(processor==null){
				processor = (IProcessor) Class.forName(clazz.getName())
						.newInstance();
				processorTable.put(clazz.getName(), processor);
				}
			}
		}

		return processor;
	}

}
