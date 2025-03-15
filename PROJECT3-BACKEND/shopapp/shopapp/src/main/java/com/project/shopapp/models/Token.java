package com.project.shopapp.models;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "shopapp_tokens")
@Data
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String token;

    @Column(name = "token_type", length = 50)
    private String tokenType;

    @Column(name = "expiration_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expirationDate;

    private Boolean revoked;

    private Boolean expired;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}