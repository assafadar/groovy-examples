package com.test.demo

class ClassesExample {
	String className;
	int classType;
	
	String getNameAndType() {
		"$className $classType";
	}
	
	def someMethod(List numbers = [1,2,3,4]) {
		for(def i : numbers) {
			println(i);
		}
	}
	
	static void main(String[] args) {
		ClassesExample ex = new ClassesExample(className: "Test class",classType: 1);
		println ex.getNameAndType();
		ex.someMethod(['re','sd']);
		println(ex.getClassName());
	}	
}
