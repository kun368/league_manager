package com.zzkun.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 管理员类
 */

@Entity
public class Manager implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;


}
