package com.Trial;

import com.demoProject.Utility.FileUtil;
import com.demoProject.Utility.Utility;

public class Trials {

	public static void main(String[] args) throws Exception {
		String filPath = (System.getProperty("user.dir") + "\\src\\test\\resources\\ss.Properties");
		String ss = "chromeBrowser";
		FileUtil fl = new FileUtil();
		fl.getPathAndKey(filPath, ss);
		Utility ut = new Utility();
		ut.openBrowser(fl.getPathAndKey(filPath, ss));

	}
}
