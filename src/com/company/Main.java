package com.company;


public class Main {

    public static void main(String[] args) {
        Integers queue = new Integers();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.print();
        queue.poll();
        queue.print();
        System.out.println(queue.peek());
        queue.print();

        System.out.println("-------------------------");

        IntegersLIFO queue1 = new IntegersLIFO();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        queue1.add(9);
        queue1.add(5);
        queue1.print();
        queue1.poll();
        queue1.print();
        System.out.println(queue1.peek());
        queue1.print();
    }
}
