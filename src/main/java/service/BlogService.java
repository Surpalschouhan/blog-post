package service;

import dto.Blog;
import entity.BlogPost;

import java.util.List;

public interface BlogService {

    public Blog getBlog(Integer blogId) throws Exception;

    public List<Blog> getBlogByTitle(String title) throws Exception;

    public List<Blog> getBlogByContent(String content) throws Exception;

    public List<Blog> getBlogByCategory(String category) throws Exception;
}
