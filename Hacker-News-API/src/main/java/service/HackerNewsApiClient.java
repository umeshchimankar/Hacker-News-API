package service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.example.HackerNewsAPI.Hacker.News.API.Comment;
import com.example.HackerNewsAPI.Hacker.News.API.Story;

@Component
public class HackerNewsApiClient {
    private static final String BASE_URL = "https://hacker-news.firebaseio.com/v0";
    private final RestTemplate restTemplate;
    public HackerNewsApiClient(RestTemplate restTemplate, CacheManager cacheManager) {
        this.restTemplate = restTemplate;
    }

    @Cacheable("topStories")
    public List<Long> getTopStories() {
        ResponseEntity<Long[]> response = restTemplate.getForEntity(BASE_URL + "/topstories.json", Long[].class);
        return Arrays.asList(response.getBody());
    }

    @Cacheable("story")
    public Story getStory(long storyId) {
        ResponseEntity<Story> response = restTemplate.getForEntity(BASE_URL + "/item/" + storyId + ".json", Story.class);
        return response.getBody();
    }

    @Cacheable("comments")
    public List<Comment> getComments(long storyId) {
        ResponseEntity<Long[]> response = restTemplate.getForEntity(BASE_URL + "/item/" + storyId + ".json", Long[].class);
        java.util.List<Long> commentIds = Arrays.asList(response.getBody());
        List<Comment> comments = new ArrayList<>();
        for (long commentId : commentIds) {
            Comment comment = getComment(commentId);
            if (comment != null) {
                comments.add(comment);
            }
        }
        return comments;
    }

    @Cacheable("comment")
    public Comment getComment(long commentId) {
        ResponseEntity<Comment> response = restTemplate.getForEntity(BASE_URL + "/item/" + commentId + ".json", Comment.class);
        Comment comment = response.getBody();
        if (comment != null && comment.getText() != null && !comment.getText().isEmpty()) {
            return comment;
        }
        return null;
    }
}
