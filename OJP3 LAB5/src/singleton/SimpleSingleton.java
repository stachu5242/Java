package singleton;

import java.util.*;

public class SimpleSingleton {
	
	private static SimpleSingleton singletonInstance;
	private static Date creationDate;
	private static SimpleSingleton()
	{
		
	}
	public static SimpleSingleton getSingletonInstance()
	{
		if(null == singletonInstance)
		{
			singletonInstance = new SimpleSingleton();
			creationDate = new Date();
			System.out.println("Created new Singleton: "+creationDate);
		}
	}

}
