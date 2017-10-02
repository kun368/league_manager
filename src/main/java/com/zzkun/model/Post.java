package com.zzkun.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 社团公告类
 */
@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;



}
