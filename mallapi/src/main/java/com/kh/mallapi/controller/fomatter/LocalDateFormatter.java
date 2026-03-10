package com.kh.mallapi.controller.fomatter;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.format.Formatter;

public class LocalDateFormatter implements Formatter<LocalDate>{

	@Override 
	//db에서 넘어온 날짜를 리엑트로 넘기기위해서 문자열로 변경
	public String print(LocalDate object, Locale locale) { 
	return  DateTimeFormatter.ofPattern("yyyy-MM-dd").format(object); 
	} 
	 
	@Override 
	//리엑트에서 날짜를 리엑트로 넘기기위해서 문자열로 변경
	public LocalDate parse(String text, Locale locale) throws ParseException { 
	return  LocalDate.parse(text, DateTimeFormatter.ofPattern("yyyy-MM-dd")); 
	} 

}
