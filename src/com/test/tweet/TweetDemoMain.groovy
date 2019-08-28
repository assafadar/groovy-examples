package com.test.tweet

class TweetDemoMain {
	
	static void main(String[] args) {
		Tweet tweet = new Tweet(
			post: "This is a demo post #java #groovy by @asaf",
			username: "@Asaf",
			postDate: new Date()
		);	
		
		tweet.addFavorite("@TEst");
		tweet.addRetweet("@Testsss");
		println tweet.favorites
		println tweet.retweers
		println tweet.getMentions();
		println tweet.getHashtags();
	}
}
