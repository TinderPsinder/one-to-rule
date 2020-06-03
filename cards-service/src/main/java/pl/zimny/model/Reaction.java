package pl.zimny.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reaction", schema = "cards")
public class Reaction {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    Long reactingUserId;

    @Column
    Long swipedUserId;

    @Column
    boolean like;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable = false, updatable = false, nullable = false)
    private Date creationDate;
}

