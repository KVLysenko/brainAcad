package com.shop.shop.Security.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@NamedEntityGraph(
        name = "Graph.User",
        includeAllAttributes = false,
        attributeNodes = {
                @NamedAttributeNode(value = "id"),
                @NamedAttributeNode(value = "email"),
                @NamedAttributeNode(value = "password"),
                @NamedAttributeNode(value = "firstName"),
                @NamedAttributeNode(value = "lastName"),
                @NamedAttributeNode(value = "phoneNumber"),
                @NamedAttributeNode(value = "adress"),
                @NamedAttributeNode(value = "roleEntitySet", subgraph = "SubGraph.role"),

        },
        subgraphs = {
                @NamedSubgraph(
                        name = "SubGraph.role",
                        attributeNodes = {
                                @NamedAttributeNode(value = "id"),
                                @NamedAttributeNode(value = "name"),
                        }
                )
        }
)

@Data
@Entity
@Table(schema = "security", name = "app_user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "adress")
    private String adress;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinTable(schema = "security", name = "app_user_role_id",
                joinColumns = @JoinColumn(name = "app_user_id"),
                inverseJoinColumns = @JoinColumn(name = "app_role_id"))
    private Set<RoleEntity> roleEntitySet;
}
