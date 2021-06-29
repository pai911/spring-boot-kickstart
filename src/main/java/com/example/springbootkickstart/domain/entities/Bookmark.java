package com.example.springbootkickstart.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Bookmark {
    @Id
    @SequenceGenerator(
            name = "bookmark_sequence",
            sequenceName = "bookmark_sequence", allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "bookmark_sequence"
    )
    @Column(name = "id", updatable = false) /// optional
    private Long id;
    private String name;
    private String url;
}
