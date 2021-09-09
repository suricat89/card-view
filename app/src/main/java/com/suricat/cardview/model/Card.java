package com.suricat.cardview.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Card {
    private String name;
    private Date date;
    private int imageId;
    private String description;
    private boolean liked;
    private int likes;
    private List<Comment> comments;

    public Card(String name, Date date, int imageUrl, String description) {
        this.name = name;
        this.date = date;
        this.imageId = imageUrl;
        this.description = description;
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

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
