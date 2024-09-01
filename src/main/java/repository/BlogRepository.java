package repository;

import dto.Blog;
import entity.BlogPost;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BlogRepository extends CrudRepository<BlogPost, Integer> {

    public List<BlogPost> findByTitleLike(String title);

    public List<BlogPost> findByContentLike(String content);

    public List<BlogPost> findByCategoryLike(String category);
}
