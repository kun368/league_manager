package com.zzkun.view;

import com.zzkun.dao.ManagerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ManagerView {

    @Autowired private Scanner cin;
    @Autowired private ManagerDao managerDao;

    public void run() {

    }

}
