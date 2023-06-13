package com.ohgiraffers.section01.java;

import com.ohgiraffers.commom.DrinkDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        DrinkDAO drinkDAO = context.getBean("drinkDAO", DrinkDAO.class);

        Scanner sc = new Scanner(System.in);
        System.out.println("===========자판기 시스템 시작=============");
        System.out.println("1. 음료 전체 조회");
        System.out.println("2. 음료 신규 등록");
        System.out.println("3. 음료 메뉴 삭제");
        System.out.println("4. 음료 메뉴 사기");
        System.out.println("5. 자판기 종료하기");
        System.out.println("=====1, 2, 3, 4, 5 중 번호를 고르시오====");
        int input = sc.nextInt();



    }




}
