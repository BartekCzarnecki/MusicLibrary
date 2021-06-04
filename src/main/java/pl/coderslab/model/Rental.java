package pl.coderslab.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 4)
    private String date;

    @ManyToOne
    private Music music;

    @ManyToOne
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Rental() {
    }

    public Rental(Long id, String date, Music music, User user) {
        this.id = id;
        this.date = date;
        this.music = music;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", music=" + music +
                ", user=" + user +
                '}';
    }
}
