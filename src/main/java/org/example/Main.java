package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person onlyLanguageData = new Person(new String[]{"JS", "JAVA", "React"});
        System.out.println("User's languages:" +Arrays.toString(onlyLanguageData.languages));

        Person BerkWithAllParams = new Person(false, new String[]{"JS", "JAVA", "React"},"tr",29,"Karademir","Berk");
        System.out.println(BerkWithAllParams);

        Person withBasicInfos = new Person("Berk", "Karademir", 28);
        System.out.println("Firstname: " + withBasicInfos.getFirstName());
        System.out.println("LastName: " + withBasicInfos.getLastName());
        System.out.println("Age: " + withBasicInfos.getAge());
        System.out.println("------------- WALL-----------");
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        wall.setHeight(1.5);
        wall.setWidth(1.5);

        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
