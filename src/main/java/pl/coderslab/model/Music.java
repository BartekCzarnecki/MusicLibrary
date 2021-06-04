package pl.coderslab.model;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

@Entity
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String artist; //not blank

    @NotBlank
    private String title; //not blank

    @NotBlank
    private String format; //not blank
    private String label;

    @Digits(integer = 4, fraction = 0)
    private Long year;//size = 4
    private String genre;
    private String musicStyle;

    @ManyToOne
    private User user;

    @ManyToOne
    private Artist art;

    @OneToOne (mappedBy = "music")
    private Rental rental;

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", format='" + format + '\'' +
                ", label='" + label + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", musicStyle='" + musicStyle + '\'' +
                ", user=" + user +
                ", art=" + art +
                ", rental=" + rental +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMusicStyle() {
        return musicStyle;
    }

    public void setMusicStyle(String musicStyle) {
        this.musicStyle = musicStyle;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Artist getArt() {
        return art;
    }

    public void setArt(Artist art) {
        this.art = art;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    public Music() {
    }

    public Music(Long id, String artist, String title, String format, String label, Long year, String genre, String musicStyle, User user, Artist art, Rental rental) {
        this.id = id;
        this.artist = artist;
        this.title = title;
        this.format = format;
        this.label = label;
        this.year = year;
        this.genre = genre;
        this.musicStyle = musicStyle;
        this.user = user;
        this.art = art;
        this.rental = rental;
    }
}
