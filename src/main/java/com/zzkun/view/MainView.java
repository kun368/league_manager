package com.zzkun.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MainView {

    @Autowired private Scanner cin;
    @Autowired private ActivityView activityView;
    @Autowired private EvaluationView evaluationView;
    @Autowired private LeagueView leagueView;
    @Autowired private ManagerView managerView;
    @Autowired private PostView postView;
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
                case 2:
                    leagueView.run();
                    break;
                case 3:
                    activityView.run();
                    break;
                case 4:
                    postView.run();
                    break;
                case 5:
                    evaluationView.run();
                    break;
                case 6:
                    managerView.run();
                    break;
                case 0:
                    return;
            }
        }
    }

    private void printMainMenu() {
        System.out.println("========主菜单========");
        System.out.println("1.学生用户管理");
        System.out.println("2.社团管理");
        System.out.println("3.社团活动管理");
        System.out.println("4.社团公告管理");
        System.out.println("5.社管质量(评价体系)管理");
        System.out.println("6.管理员账号管理");
        System.out.println("0.退出社团管理系统");
        System.out.println("=====================");
    }
}
