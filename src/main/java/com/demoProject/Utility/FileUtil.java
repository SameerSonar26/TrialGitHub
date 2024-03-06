package com.demoProject.Utility;

import java.io.FileInputStream;

import java.util.Properties;

public class FileUtil {

	

	
	public String getPathAndKey(String fpath,String key) throws Exception {

		FileInputStream fis = new FileInputStream(fpath);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		
	}

}
