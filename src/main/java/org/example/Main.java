package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");
        int i=1;
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
                Wise wise_saying = new Wise(wise_Saying,auther);
                System.out.println( i +"번 명언이 등록되었습니다.");
                i++;
            }
        }
    }
}
class Wise{
    String wise_Saying;
    String auther;
    Wise(String wise_Saying, String auther){
        this.wise_Saying=wise_Saying;
        this.auther=auther;
    }
}