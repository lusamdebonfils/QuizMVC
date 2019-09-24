package edu.mum.cs.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String LastName;
    private String country;
    private String occupation;
    private String phone;
    private LocalDate birthDate;
    private String email;
    private String City;
    private String userName;
    private String password;
    private boolean blocked;

    @OneToMany(mappedBy="user")
    private List<Post> post;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_picture_id", referencedColumnName = "id")
    private Picture profilePicture;

    public User() {
    }


    public User(String firstName, String lastName, String country, String occupation, String phone, LocalDate birthDate, String email, String city, String userName, String password, boolean blocked, List<Post> post, Picture profilePicture) {
        this.firstName = firstName;
        LastName = lastName;
        this.country = country;
        this.occupation = occupation;
        this.phone = phone;
        this.birthDate = birthDate;
        this.email = email;
        City = city;
        this.userName = userName;
        this.password = password;
        this.blocked = blocked;
        this.post = post;
        this.profilePicture = profilePicture;
    }

    public User(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public List<Post> getPost() {
        return post;
    }

    public void setPost(List<Post> post) {
        this.post = post;
    }

    public Picture getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Picture profilePicture) {
        this.profilePicture = profilePicture;
    }
}