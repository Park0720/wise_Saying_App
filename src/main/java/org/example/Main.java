package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf("명령) ");
            String order = sc.nextLine();
            if(order.equals("종료")) {
                break;
            }
            if(order.equals("등록"));{
                System.out.printf("명언 : ");
                String wise_Saying = sc.nextLine();
                System.out.printf("작가 : ");
                String auther = sc.nextLine();
                System.out.println("1번 명언이 등록되었습니다.");
            }
        }
    }
}