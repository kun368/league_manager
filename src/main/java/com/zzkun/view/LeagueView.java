package com.zzkun.view;

import com.zzkun.dao.LeagueDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class LeagueView {

    @Autowired private Scanner cin;
    @Autowired private LeagueDao leagueDao;

    public void run() {

    }

}
