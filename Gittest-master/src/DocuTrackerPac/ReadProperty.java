package DocuTrackerPac;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.PropertyResourceBundle;

import com.beust.jcommander.ResourceBundle;

public class ReadProperty {
	
	PropertyResourceBundle bundle = null;
	public static String username = ".//*[@id='txtUserName']";
	public static String pswd = ".//*[@id='txtPassword']";
	public static String loginbox = ".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input";
	public static String submit = ".//*[@id='btnSubmit']";
	
}