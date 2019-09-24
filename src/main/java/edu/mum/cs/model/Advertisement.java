package edu.mum.cs.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Advertisement {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String text;

    @OneToMany(mappedBy="advertisement")
    private List<Picture> picture;
    private boolean enabled;

    public Advertisement() {
    }

    public Advertisement(String text, List<Picture> picture, boolean enabled) {
        this.text = text;
        this.picture = picture;
        this.enabled = enabled;
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
}
