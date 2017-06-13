package andrew;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by andrew on 13.06.17.
 */
public class Author implements Serializable {

    private Long authorId;
    private String authorFirstName;
    private String authorLastName;
    private Date authorDateOfBirth;
    private String authorBiography;

    public Author() {
    }

    public Author(Long authorId, String authorFirstName, String authorLastName, Date authorDateOfBirth, String authorBiography) {
        this.authorId = authorId;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.authorDateOfBirth = authorDateOfBirth;
        this.authorBiography = authorBiography;
    }

    public Long getAuthorId() {
        return authorId;
    }
    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }
    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }
    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public Date getAuthorDateOfBirth() {
        return authorDateOfBirth;
    }
    public void setAuthorDateOfBirth(Date authorDateOfBirth) {
        this.authorDateOfBirth = authorDateOfBirth;
    }

    public String getAuthorBiography() {
        return authorBiography;
    }
    public void setAuthorBiography(String authorBiography) {
        this.authorBiography = authorBiography;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorFirstName='" + authorFirstName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                ", authorDateOfBirth=" + authorDateOfBirth +
                ", authorBiography='" + authorBiography + '\'' +
                '}';
    }
}
