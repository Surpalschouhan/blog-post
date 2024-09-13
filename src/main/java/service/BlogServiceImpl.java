package service;

import dto.Blog;
import entity.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import repository.BlogRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Blog getBlog(Integer blogId) throws Exception {
        Optional<BlogPost> optionalBlog = blogRepository.findById(blogId);
        BlogPost blogPost = optionalBlog.orElseThrow();
        return new Blog(blogPost);
    }

    @Override
    public List<Blog> getBlogByTitle(String title) throws Exception {
        List<BlogPost> blogPosts = blogRepository.findByTitleLike(title);
        List<Blog> blogs = new ArrayList<>();
        for(BlogPost blogPost : blogPosts) {
            blogs.add(new Blog(blogPost));
        }
        return blogs;
    }

    @Override
    public List<Blog> getBlogByContent(String content) throws Exception {
        List<BlogPost> blogPosts = blogRepository.findByContentLike(content);
        List<Blog> blogs = new ArrayList<>();
        for(BlogPost blogPost : blogPosts) {
            blogs.add(new Blog(blogPost));
        }
        return blogs;
    }

    @Override
    public List<Blog> getBlogByCategory(String category) throws Exception {
        List<BlogPost> blogPosts = blogRepository.findByCategoryLike(category);
        List<Blog> blogs = new ArrayList<>();
        for(BlogPost blogPost : blogPosts) {
            blogs.add(new Blog(blogPost));
        }
        return blogs;
    }
}
