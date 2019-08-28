package com.test.beans

class GroovyBeansMain {
	
	static void main(String[] args) {
		GroovyBean bean = new GroovyBean(first: "asaf",last: "addar",email: "asaf@test.com");
		bean.first="asafadar"
		println bean;
		println bean.first;
		bean.number = 10;
		//Uses the getter
		println bean.number;
		//accesses the actual attribute, In case it's public.
		println bean.@number;
		
	}
}
