package pl.coderslab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

//    @ManyToMany (mappedBy = "user")
//    private List<Music> musicList = new ArrayList<>();
//
//    @OneToMany (mappedBy = "user")
//    private List<Rental> rentalList = new ArrayList<>();

}
