package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.HackerNewsAPI.Hacker.News.API.Story;

@Service
public class HackerNewsService {
    private final HackerNewsApiClient hackerNewsApiClient;

    public HackerNewsService(HackerNewsApiClient hackerNewsApiClient) {
        this.hackerNewsApiClient = hackerNewsApiClient;
    }

    public List<Story> getTopStories() {
        List<Story> stories = new ArrayList<>();
		return stories;
       
}
}