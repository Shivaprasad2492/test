package blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Profile_Photo")
public class ProfilePhoto implements Serializable{

    @Id
    @Column(name="id")
    private int id;

    @Column
    private String profile_Photo_Location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfilePhotoLocation() {
        return profile_Photo_Location;
    }

    public void setProfilePhotoLocation(String profilePhotoLocation) {
        this.profile_Photo_Location = profile_Photo_Location;
    }
}
