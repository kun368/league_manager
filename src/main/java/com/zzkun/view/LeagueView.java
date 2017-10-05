package com.zzkun.view;

import com.zzkun.dao.LeagueDao;
import com.zzkun.model.League;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class LeagueView {

    @Autowired private Scanner cin;
    @Autowired private LeagueDao leagueDao;

    public void run() {
        while (true) {
            printMenu();
            int num = cin.nextInt();
            if (num == 1) {
                allLeague();
            }
            else if (num == 2) {
                addLeague();
            }
            else {
                break;
            }
        }
    }

    private void allLeague() {
        System.out.println("所有社团信息：");
        for (League league : leagueDao.findAll()) {
            System.out.println(league);
        }
    }

    private void addLeague() {
        League league = new League();
        System.out.print("请输入社团名称：");
        league.setName(cin.next());
        System.out.print("请输入社团所属学院");
        league.setAcademy(cin.next());
        System.out.print("请输入社团费(人民币/人)：");
        league.setClubDue(cin.nextDouble());
        leagueDao.save(league);
    }

    private void printMenu() {
        System.out.println("-----------------------");
        System.out.println("1.查看当前所有社团信息");
        System.out.println("2.添加新社团");
        System.out.println("3.修改社团信息");
        System.out.println("4.单社团管理(公告、评价、人员、活动、社团费用)");
        System.out.println("0.返回上一层");
        System.out.println("-----------------------");
    }

}
