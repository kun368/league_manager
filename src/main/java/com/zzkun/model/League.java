package com.zzkun.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 社团类
 */

@Entity
public class League implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String name;

    private String academy;

    private Double clubDue;

    private LocalDate startDate;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "league_activity",
        joinColumns = {@JoinColumn(name = "league_id", referencedColumnName = "id")},
        inverseJoinColumns = {@JoinColumn(name = "activity_id", referencedColumnName = "id")})
    private List<Activity> activityList = new ArrayList<>();

    @OneToMany(mappedBy = "toLeague")
    private List<Evaluation> evaluationList = new ArrayList<>();

    @OneToMany(mappedBy = "byLeague")
    private List<Post> postList = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "league_user",
        joinColumns = {@JoinColumn(name = "league_id", referencedColumnName = "id")},
        inverseJoinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")})
    private List<User> userList = new ArrayList<>();

    /// =======

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }

    public List<Evaluation> getEvaluationList() {
        return evaluationList;
    }

    public void setEvaluationList(List<Evaluation> evaluationList) {
        this.evaluationList = evaluationList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Double getClubDue() {
        return clubDue;
    }

    public void setClubDue(Double clubDue) {
        this.clubDue = clubDue;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    @Override
    public String toString() {
        return "League{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", academy='" + academy + '\'' +
                ", clubDue=" + clubDue +
                ", startDate=" + startDate +
                '}';
    }
}
