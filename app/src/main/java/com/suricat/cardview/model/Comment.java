package com.suricat.cardview.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comment {
    private String name;
    private Date date;
    private String text;
    private boolean liked;
    private int likes;
    private List<Comment> comments;

    public Comment(String name, Date date, String text) {
        this.name = name;
        this.date = date;
        this.text = text;
        this.liked = false;
        this.likes = 0;
        this.comments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
