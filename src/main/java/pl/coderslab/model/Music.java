package pl.coderslab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
