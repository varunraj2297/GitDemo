package com.nt.test;

import java.io.File;

import javax.xml.XMLConstants;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import com.nt.handler.BookHandler;


public class SAXParserTest {

public static void main(String[] args) throws Exception {
		
		SAXParserFactory factory=SAXParserFactory.newInstance();
		SAXParser parser=factory.newSAXParser();
		parser.parse(new File("Book.xml"),new BookHandler());
	}

}
