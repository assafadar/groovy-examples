package com.test.inheritence

class InheritenceExampleMain {

	static void main(args) {
		ChildExample ex = new ChildExample(appStore: "AppStore",name: "IPhone",os: "Apple");
		println ex;
		println ex.getDetails()
	}
}
