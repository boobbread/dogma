package org.example;

public class Main {
    static int lifePoints = 2;

    static void main(String[] args) {
        System.out.println(lifePoints);

        multiplyLP(5);

        System.out.println(lifePoints);
    }

    public static void multiplyLP(int mult) {
        // Variable A (operator) Variable B
        lifePoints *= mult;
    }

    // Variables

    // Constructor

    // Methods
}