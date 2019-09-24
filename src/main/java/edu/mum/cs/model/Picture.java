package edu.mum.cs.model;

import javax.persistence.*;
import java.sql.Blob;

@Entity
public class Picture {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Blob image;

    @ManyToOne
    @JoinColumn(name="post_id", nullable=false)
    private Post post;

    @OneToOne(mappedBy = "profilePicture")
    private User user;

    @ManyToOne
    @JoinColumn(name="advertisement_id", nullable=false)
    private Advertisement advertisement;

    public Picture() {
    }

    public Picture(Blob image, Post post, User user, Advertisement advertisement) {
        this.image = image;
        this.post = post;
        this.user = user;
        this.advertisement = advertisement;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Advertisement getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(Advertisement advertisement) {
        this.advertisement = advertisement;
    }
}