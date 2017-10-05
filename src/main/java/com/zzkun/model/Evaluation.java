package com.zzkun.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 社团评价类
 */

@Entity
public class Evaluation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer star;

    private String content;

    private LocalDateTime time;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "to_league_id")
    private League toLeague;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "by_user_id")
    private User byUser;

    // ======

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "id=" + id +
                ", star=" + star +
                ", content='" + content + '\'' +
                ", time=" + time +
                '}';
    }
}
