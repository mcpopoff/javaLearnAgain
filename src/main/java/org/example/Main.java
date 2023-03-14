package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("-----LESSON_008-----");
        Counter e = new Counter("evenCounter");
        Counter o = new Counter("oddCounter");
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                e.increase();
            } else {
                o.increase();
            }
        }

        System.out.println(e);
        System.out.println(o);
    }
}
