package com.example.HackerNewsAPI.Hacker.News.API;

public class Comment {
    public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getBy() {
		return by;
	}
	public void setBy(String by) {
		this.by = by;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getKids() {
		return kids;
	}
	public void setKids(int kids) {
		this.kids = kids;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private String text;
    private String by;
    private String url;
    private int kids;
    private int parent;
    private int id;
    private long time;
    private String type;
  
}

