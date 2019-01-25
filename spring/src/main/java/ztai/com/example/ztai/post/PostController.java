package ztai.com.example.ztai.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/api/posts")
    public List<Post> getAllPosts() {
        return postService.getAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @ResponseBody
    @GetMapping("/api/posts/{id}")
    public Post get(@PathVariable("id") int id) {
        return postService.get(id);
    }
}