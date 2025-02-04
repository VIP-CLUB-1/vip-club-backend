package com.wthallys.vip_club.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tb_photos")
public class Photos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String photoUrl;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserVip userId;
}
