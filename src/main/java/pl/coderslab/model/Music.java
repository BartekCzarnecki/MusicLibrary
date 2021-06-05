package pl.coderslab.model;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title; //not blank

    @NotBlank
    private String format; //not blank

    @NotBlank
    private String label;

    @Digits(integer = 4, fraction = 0)
    private Long year;//size = 4

    @NotBlank
    private String genre;

    @NotBlank
    private String musicStyle;

    @NotNull
    @ManyToOne
    private Artist artist;

//    @OneToMany (mappedBy = "music")
//    private List<Rental> rentList = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Music() {
    }

    public Music(Long id, String title, String format, String label, Long year, String genre, String musicStyle, Artist artist) {
        this.id = id;
        this.title = title;
        this.format = format;
        this.label = label;
        this.year = year;
        this.genre = genre;
        this.musicStyle = musicStyle;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", format='" + format + '\'' +
                ", label='" + label + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", musicStyle='" + musicStyle + '\'' +
                ", artist=" + artist +
                '}';
    }
}
