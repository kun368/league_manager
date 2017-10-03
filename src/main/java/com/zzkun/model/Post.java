package com.zzkun.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 社团公告类
 */
@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;

    private LocalDateTime postTime;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "by_league_id")
    private League byLeague;

    // =====


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getPostTime() {
        return postTime;
    }

    public void setPostTime(LocalDateTime postTime) {
        this.postTime = postTime;
    }

    public League getByLeague() {
        return byLeague;
    }

    public void setByLeague(League byLeague) {
        this.byLeague = byLeague;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", postTime=" + postTime +
                '}';
    }
}
