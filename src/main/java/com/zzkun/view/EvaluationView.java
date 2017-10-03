package com.zzkun.view;

import com.zzkun.dao.EvaluationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class EvaluationView {

    @Autowired private Scanner cin;
    @Autowired private EvaluationDao evaluationDao;

    public void run() {

    }

}
