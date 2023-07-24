package kz.adem.springboot.entity;

import jakarta.persistence.*;
import lombok.Data;

//Entity class for data from wikimedia
@Data
@Entity
@Table(name = "wikimedia_recentchange")
public class WikimediaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "LONGTEXT", length = 16777215)
    private String wikiEventData;
}
