package com.test.beans

/**
 * 
 * @author assaf
 *	
 *Groovy bean vs Java bean.
 *
 *In groovy there is no need to create getters, setters and default constructor.
 *
 *The groovy frmaework takes cate of it for us
 *
 */
@groovy.transform.ToString
class GroovyBean implements Serializable{

	String first,last,email;
	
	private int number;
	
	int getNumber() {
		number * 2;
	}
	
}
