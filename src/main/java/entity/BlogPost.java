package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Timestamp;


@Entity
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer blogId;

    private String title;

    private String content;

    private String category;

    private String tags;

    private Timestamp createdAt;

    private Timestamp updatedAt;

}
