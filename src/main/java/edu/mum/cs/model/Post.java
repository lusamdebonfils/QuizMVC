package edu.mum.cs.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String text;

    @OneToMany(mappedBy="post")
    private List<Picture> picture;
    private boolean enabled;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    public Post(String text, List<Picture> picture, boolean enabled, User user) {
        this.text = text;
        this.picture = picture;
        this.enabled = enabled;
        this.user = user;
    }

    public Post() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Picture> getPicture() {
        return picture;
    }

    public void setPicture(List<Picture> picture) {
        this.picture = picture;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}