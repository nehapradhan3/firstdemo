package neha.main;

import neha.utils.ConfigUtils;

public class TestConfig {

	public static void main(String[] args) {
String name=ConfigUtils.getProperty("name");
System.out.println(name);
	}

}
