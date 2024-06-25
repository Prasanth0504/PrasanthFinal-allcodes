package com.jsonwrtite;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonWrite {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File file = new File("C:\\Users\\Prasanth\\eclipse-workspace\\JsonWrite\\src\\test\\resources\\Reports\\Pets.json");
		
		ObjectMapper mapper = new ObjectMapper();
		
		Category category = new Category(0, "String");
		
		
		ArrayList<String> photoUrls = new ArrayList<String>();
		photoUrls.add("String");
		
		Tags t = new Tags(0, "String");
		ArrayList<Tags> tags = new ArrayList<Tags>();
		tags.add(t);
		
		
		
		RootClass rootclass = new RootClass(0, category, "doggie", photoUrls, tags, "Available");
		
		mapper.writeValue(file, rootclass);
		
		System.out.println("Json write completed");

	}

}
