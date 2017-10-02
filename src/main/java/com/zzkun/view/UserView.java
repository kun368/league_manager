package com.zzkun.view;

import com.zzkun.dao.UserDao;
import com.zzkun.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class UserView {

    @Autowired private Scanner cin;
    @Autowired private UserDao userDao;

    public void run() {
        while (true) {
            printMenu();
            int num = cin.nextInt();
            if (num == 1) {
                showAllUser();
            } else if (num == 2) {
                addUser();
            } else {
                return;
            }
        }
    }

    private void showAllUser() {
        List<User> users = userDao.findAll();
        System.out.println("所有用户信息：");
        for (User user : users) {
            System.out.println(user);
        }
    }

    private void addUser() {
        User user = new User();
        System.out.print("输入新用户学号：");
        user.setUsername(cin.next());
        System.out.print("输入新用户密码：");
        user.setPassword(cin.next());
        System.out.print("输入新用户专业：");
        user.setMajor(cin.next());
        System.out.print("输入新用户家庭地址：");
        user.setAddress(cin.next());
        try {
            userDao.save(user);
        } catch (Exception e) {
            System.out.println("添加新用户失败！");
        }
    }

    private void printMenu() {
        System.out.println("-----------------------");
        System.out.println("1.查看当前所有学生信息");
        System.out.println("2.添加新的学生用户");
        System.out.println("3.修改学生用户信息");
        System.out.println("4.修改学生密码");
        System.out.println("5.修改学生专业信息");
        System.out.println("6.修改学生家庭地址信息");
        System.out.println("0.返回上一层");
        System.out.println("-----------------------");
    }

}
