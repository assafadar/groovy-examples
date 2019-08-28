package com.test.closures

class CurryMethod {

	static void main(args) {
		CurryMethod c = new CurryMethod();	
		
		c.log("DEBUG",new Date(),"This is a debug statement");
		c.debugLog(new Date(),"This is a second debug message");
	}
	
	
	def log = {
		String type, Date createdAt, String msg ->
			println "$createdAt [$type] - $msg"
	}
	
	def debugLog = log.curry("DEBUG");
	
}
