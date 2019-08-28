package com.test.tweet
@groovy.transform.Canonical
class Tweet {
	String post,username;
	Date postDate;
	/**
	 * No getters and setters will be automatically generated
	 */
	private List favorites = [];
	private List retweets = [];
	private List mentions = [];
	private List hashtags = [];
	
	void addFavorite(String username) {
		//Add to lists
		favorites << username;
	}
	
	List getFavorites() {
		favorites;
	}
	
	void addRetweet(String username) {
		retweets << username;
	}
	
	List getRetweers() {
		retweets;
	}
	
	List getMentions() {
		String pattern = /\B@[a-z0-9_-]+/
		post.findAll(pattern);
	}
	
	List getHashtags() {
		String pattern = ~/(?:\s|\A)[##]+([A-Za-z0-9-_]+)/
		post.findAll(pattern);
	}
}
