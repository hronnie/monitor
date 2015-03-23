package com.codeproj.monitor.httptool;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectHostUtil {
	public int getHostStatus(String urlStr) throws IOException {
    	URL url = new URL(urlStr);
    	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    	connection.setRequestMethod("GET");
    	connection.connect();

    	return connection.getResponseCode();
	}
}
