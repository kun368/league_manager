package com.zzkun.view;

import com.zzkun.dao.PostDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class PostView {

    @Autowired private Scanner cin;
    @Autowired private PostDao postDao;

    public void run() {

    }

}
