package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");
        long lastWiseSaying = 0;
        List<Wise> wise = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf("명령) ");
            String order = sc.nextLine().trim();
            if (order.equals("종료")) {
                break;
            }

            else if (order.equals("등록")) {
                long id = lastWiseSaying + 1;
                System.out.printf("명언 : ");
                String wise_Saying = sc.nextLine().trim();
                System.out.printf("작가 : ");
                String auther = sc.nextLine().trim();
                Wise wise_saying = new Wise(id, wise_Saying, auther);
                wise.add(wise_saying);
                System.out.println(id + "번 명언이 등록되었습니다.");
                lastWiseSaying = id;
            }
            else if (order.equals("목록")) {
                System.out.println("번호 / 작가 / 명언\n"+"-".repeat(30));
                for(int i = wise.size()-1; i>=0;i--){
                    System.out.println(wise.get(i).getId() + " / " + wise.get(i).getAuther()+ " / " + wise.get(i).getWise_Saying());;
                }
            }
            else if(order.equals("삭제?id=1")){
                if (wise.get(0).getId() == 1){
                    System.out.println(wise.get(0).getId()+"번 명언이 삭제 되었습니다.");
                    wise.remove(0);

                }
                else{
                    System.out.println("1번 명언은 존재하지 않습니다.");
                }
            }
        }
    }
}

class Wise {
    private long id;
    private String wise_Saying;
    private String auther;

    public Wise(long id, String wise_Saying, String auther) {
        this.id = id;
        this.wise_Saying = wise_Saying;
        this.auther = auther;
    }

    public long getId() {
        return id;
    }

    public String getWise_Saying() {
        return wise_Saying;
    }

    public String getAuther() {
        return auther;
    }
}