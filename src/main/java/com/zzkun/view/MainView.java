package com.zzkun.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MainView {

    @Autowired private Scanner cin;
    @Autowired private UserView userView;

    public void run() {
        System.out.print("请输入管理员账号：");
        String username = cin.nextLine();
        System.out.print("请输入管理员密码：");
        String password = cin.nextLine();
        while (!("root".equals(username) && "root".equals(password))) {
            System.out.println("用户名或密码输入错误，请重新输入(默认root, root)");
        }
        mainControl();
    }

    private void mainControl() {
        while (true) {
            printMainMenu();
            int num = cin.nextInt();
            switch (num) {
                case 1:
                    userView.run();
                    break;
                case 0:
                    return;
            }
        }
    }

    private void printMainMenu() {
        System.out.println("========主菜单========");
        System.out.println("1.管理学生用户");
        System.out.println("0.退出系统");
        System.out.println("=====================");
    }
}
