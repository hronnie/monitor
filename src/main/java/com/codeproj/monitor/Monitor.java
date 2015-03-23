package com.codeproj.monitor;

import static com.codeproj.monitor.util.Contants.*;

import java.io.IOException;

import com.codeproj.monitor.email.EmailHelper;
import com.codeproj.monitor.httptool.ConnectHostUtil;

public class Monitor {
	
    public static void main(String[] args) throws IOException {
    	if (args.length != 1) {
    		printUsage();
    		System.exit(-1);
    	}
    	
    	ConnectHostUtil chu = new ConnectHostUtil();
    	int statusCode = chu.getHostStatus(args[0]);
    	
    	if (statusCode != STATUS_CODE_OK) {
    		EmailHelper eh = new EmailHelper();
    		eh.sendNotificationEmail(EMAIL_CONTENT_MESSAGE + args[0]);
    	}
    }

	private static void printUsage() {
		System.out.println("******* Usage: *******");
		System.out.println("You need to use the application host URL as the ");
		System.out.println("first argument of the command");
		System.out.println("----------------------------");
		System.out.println("Example: ");
		System.out.println("java -jar monitor.jar http://mydomain.com/appname");
		
	}
}
