package com.mpaskal.server.first;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService {
	public List<String> getWelcomeMessage(String name) {
	    List<String> myWelcomeMessage = new ArrayList<>();
	    
	    // Add data to the list
	    myWelcomeMessage.add("Hello! ");
	    myWelcomeMessage.add(name);
	    myWelcomeMessage.add(", welcome to the Spring! Is it your near future?");
	    
	    return myWelcomeMessage;
	}
}
