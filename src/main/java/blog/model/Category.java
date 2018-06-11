package blog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Category {

    @Id
    private int id;
    private String category_Type;

    @ManyToMany(mappedBy = "categoryList")
    @JsonIgnore
    private List<Post> posts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryType() {
        return category_Type;
    }

    public void setCategoryType(String categoryType) {
        this.category_Type = category_Type;
    }
}
