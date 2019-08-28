package com.test.inheritence
/**
 * 
 * @author assaf
 * example talks about a phone
 */

@groovy.transform.ToString
abstract class FatherExample {
	String name;
	String os;
	String appStore;
	
	def powerOn() {
		println "Power on $name"
	}	
	
	def powerOff() {
		println "Power off $name"
	}
	
	def ring() {
		
	}
	
	def getDetails() {
		"This is a $os phone the name is $name and the app store is $appStore";
	}
	
	abstract def abstractMethod();
}
