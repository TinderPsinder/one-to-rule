package pl.zimny.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDetails extends AbstractEntity{

    @OneToOne
    Profile profile;

    @Column
    String description;

    @Column
    String picture;

    public ProfileDetails(String description, String picture){
        this.description = description;
        this.picture = picture;
    }
}
