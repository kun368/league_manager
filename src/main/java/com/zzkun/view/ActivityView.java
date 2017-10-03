package com.zzkun.view;

import com.zzkun.dao.ActivityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ActivityView {

    @Autowired private Scanner cin;
    @Autowired private ActivityDao activityDao;

    public void run() {

    }
}
