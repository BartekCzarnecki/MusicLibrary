package pl.coderslab.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String fullName;

    @Size(min = 4)
    private String date;

    @ManyToOne
    private Music music;

//    @ManyToOne
//    private User user;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public Rental() {
    }

    public Rental(Long id, String fullName, String date, Music music) {
        this.id = id;
        this.fullName = fullName;
        this.date = date;
        this.music = music;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", date='" + date + '\'' +
                ", music=" + music +
                '}';
    }
}
