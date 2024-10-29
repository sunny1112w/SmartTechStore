package com.sunnny.SmartTechStore.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Table(name ="users" )
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fullName",length = 100)
    private String fullName;
    @Column( name ="phone_number",length = 10,nullable = true)
    private String phoneNumber;
    @Column(name = "email",length = 255,nullable = true)
    private String email;
    @Column(name = "address",length = 200)
    private String address;
    @Column(name = "profile_image",length = 255)
    private String profileImage;
    @Column(name = "password",length = 200,nullable = false)
    private String password;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name ="date_of_birth")
    private Date dateOfBirth;
    @Column(name = "facebook_account_id")
    private String facebookAccountId;
    @Column(name = "google_account_id")
    private String googleAccountId;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
