package blog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @Column
    private String user_Name;


    @Column
    private String password_Hash;

    @Column
    private String full_Name;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //@JsonManagedReference
    private ProfilePhoto profile_Photo;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    @JsonIgnore
    private List<Post> posts = new ArrayList<Post>();

    public User() {
    }

    public User(String user_Name, String full_Name) {
        this.user_Name = user_Name;
        this.full_Name = full_Name;
    }

    public String getUserName() {
        return user_Name;
    }

    public void setUserName(String userName) {
        this.user_Name = user_Name;
    }

    public String getPasswordHash() {
        return password_Hash;
    }

    public void setPasswordHash(String password_Hash) {
        this.password_Hash = password_Hash;
    }

    public String getFullName() {
        return full_Name;
    }

    public void setFullName(String fullName) {
        this.full_Name = full_Name;
    }

    public ProfilePhoto getProfilePhoto() {
        return profile_Photo;
    }

    public void setProfilePhoto(ProfilePhoto profilePhoto) {
        this.profile_Photo = profile_Photo;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
