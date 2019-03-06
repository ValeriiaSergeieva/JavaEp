package com.qa1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Line and press ENTER");
        String start = sc.nextLine();
        System.out.println(noRepeatSumbols(start));
    }
    public static String noRepeatSumbols(String one){
        String finish = "";
        String repeat = "";
        for (char a : one.toCharArray()) {
            if (!finish.contains("" + a)) {
                finish += a;
            }else if(finish.contains("" + a)){
                repeat+=a;
            }
        }

        for (char b : repeat.toCharArray()) {
            if (finish.contains("" + b)) {
                String no = Character.toString(b);
                finish = finish.replaceAll(no, "");
            }
        }

        return finish;

    }
}
