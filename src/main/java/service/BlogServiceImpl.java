package service;

import dto.Blog;
import entity.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import repository.BlogRepository;

import java.util.Optional;

public class BlogServiceImpl {

    @Autowired
    private BlogRepository blogRepository;

    public Blog getBlog(Integer blogId) throws Exception {
        Optional<BlogPost> optionalBlog = blogRepository.findById(blogId);

        return null;
    }
}
