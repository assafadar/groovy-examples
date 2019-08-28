package com.test.dataTypes

class DaysRangeExercise {
	
	static void main(String[] args) {
		Range r = Days.Sunday..Days.Saturday;
		println r.size();
		assert r.contains(Days.Wenesday);
		println r.from;
		println r.to;
		//List exercise
		println 'List Practice';
		List days = Days.values();
		println days;
		println days.size();
		days.remove(Days.Saturday);
		println days.size();
		days << Days.Saturday;
		println days.size();
		int index = days.indexOf(Days.Wenesday);
		println days.get(index);
		
		//Map exercise
		Map map = [:];
		int i = 1;
		days.each{
			map.put(i, it);
			i++;
		};
		println map;
		println map.getClass();
		println map.size();
		map.each{
			println it.value;
		}
	}
	
	public enum Days{
		Sunday,
		Monday,
		Tuesday,
		Wenesday,
		Thursday,
		Friday,
		Saturday
	}
}
