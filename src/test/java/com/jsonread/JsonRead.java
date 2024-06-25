package com.jsonread;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jsonwrtite.RootClass;

public class JsonRead {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
	
		File file = new File("C:\\Users\\Prasanth\\eclipse-workspace\\JsonDeserialization"
				+ "\\src\\test\\resources\\Reports\\Pets.json");
		
		ObjectMapper mapper = new ObjectMapper();
		
	ReadRootclass readValue = mapper.readValue(file, ReadRootclass.class);
		
		int id = readValue.getId();
		String name = readValue.getName();
		String status = readValue.getStatus();
	System.out.println(id);
	System.out.println(name);
	System.out.println(status);
	Category category = readValue.getCategory();
	int id2 = category.getId();
	String name2 = category.getName();
	System.out.println(id2);
	System.out.println(name2);
	ArrayList<Tags> tags = readValue.getTags();
	Tags tags3 = tags.get(0);
	int id3 = tags3.getId();
	String name3 = tags3.getName();
System.out.println(id3+"\n"+name3);
	ArrayList<String> photoUrls = readValue.getPhotoUrls();
	System.out.println(photoUrls.size());
	String string = photoUrls.get(0);
	
	for (int j = 0; j < photoUrls.size(); j++) {
		String string2 = photoUrls.get(0);
	System.out.println(string2);
	
	}
	
	
	
	
	
	
	}

}
