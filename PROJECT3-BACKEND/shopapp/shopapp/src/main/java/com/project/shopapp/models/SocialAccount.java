package com.project.shopapp.models;

public class SocialAccount {
}
package com.yourpackage.shopapp.models;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "shopapp_social_accounts")
@Data
public class SocialAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String provider;

    @Column(name = "provider_id", length = 50)
    private String providerId;

    @Column(length = 150)
    private String email;

    @Column(length = 100)
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}