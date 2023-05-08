package com.example.HackerNewsAPI.Hacker.News.API;

public class Story {
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private String title;
    public int getDescendants() {
		return descendants;
	}
	public void setDescendants(int descendants) {
		this.descendants = descendants;
	}
	private String url;
    private int score;
    private int id;
    private long time;
    private String by;
    private String type;
    private int descendants;
}


