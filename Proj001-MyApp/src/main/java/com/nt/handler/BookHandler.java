package com.nt.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BookHandler extends DefaultHandler {

	boolean bookId=false;
	boolean bookName=false;
	boolean bookAuthor=false;
	
	 @Override
	public void startDocument() throws SAXException {
		System.out.println("Document Parsing started");
	}
	 
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	    if(qName.equals("book-id"))
	    	bookId=true;
	    else if(qName.equals("book-name")) {
	    	bookName=true;
	    	System.out.println("No. of pages::"+attributes.getValue("pages"));
	    }
	    else if(qName.equals("book-author"))
	    	bookAuthor=true;
	}
	 
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
	    if(bookId) {
	    	System.out.println("start element::"+new String(ch, start, length));
	        bookId=false;
	    }
	    else if(bookName) {
	    	System.out.println("start element::"+new String(ch, start, length));
	        bookName=false;
	    }
	    else if(bookAuthor) {
	    	System.out.println("start element::"+new String(ch, start, length));
	        bookAuthor=false;
	    }
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
	}
	 @Override
	public void endDocument() throws SAXException {
		System.out.println("Document Parsing ended");
	}

	public void m1(){
         System.out.println("m1() start");
		 System.out.println("m1() end");
	}
}
