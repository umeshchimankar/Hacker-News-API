package com.example.HackerNewsAPI.Hacker.News.API;

public class job {

	public job() {
		
	}
	private String text;
    public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getBy() {
		return by;
	}
	public void setBy(String by) {
		this.by = by;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private int score;
    private int id;
    private long time;
    private String by;
    private String title;
    private String url;
    private String type;
    
}



