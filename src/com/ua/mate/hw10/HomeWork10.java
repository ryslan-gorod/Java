package com.ua.mate.hw10;

public class HomeWork10 {
    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(4.8, 2.86);
        ComplexNumber complexNumber2 = new ComplexNumber(2.86, 4.8);
        ComplexNumber complexNumber3 = new ComplexNumber(4.8, 2.86);
        System.out.println("cn - " + complexNumber.hashCode());
        System.out.println("cn2 - " + complexNumber2.hashCode());
        System.out.println("cn3 - " + complexNumber3.hashCode());
        System.out.println("cn.equals(cn2) - " + complexNumber.equals(complexNumber2));
        System.out.println("cn.equals(cn3) - " + complexNumber.equals(complexNumber3));
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0; i < 3; i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                return;
            } catch (RobotConnectionException e) {
                if (i >= 2) {
                    throw new RobotConnectionException(e.getMessage(), e);
                }
            }
        }
    }
}
