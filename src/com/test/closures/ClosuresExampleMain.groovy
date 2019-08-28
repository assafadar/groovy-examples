package com.test.closures

class ClosuresExampleMain {

	static void main(args) {
		ClosuresExampleMain m = new ClosuresExampleMain();
		m.sayHello("Asasf");
		m.noParams();
		m.noParams(2);
	}
	
	def sayHello = { name -> 
		println "Hello $name"
	}
	
	//closure with no params
	def noParams = { -> 
		println "no params";
	}
}
