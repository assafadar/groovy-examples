package com.test.dataTypes

class RangeExample {
	
	
	static void main(String[] args) {
		Date today = new Date();
		Date oneWeekFromNow = today + "7";
		Range r = today..oneWeekFromNow;
		println r.from;
		println r.to;
		println r;
	}
}
