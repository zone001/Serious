package pl.adsem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Podaj wysokość Choinki");
        Scanner scanner = new Scanner(System.in);
        int treeHeight = scanner.nextInt();
        System.out.println("=======================");
        int stars = 1;
        int spaces;
        for (int treeCurrentLevel = 1;treeCurrentLevel<=treeHeight;treeCurrentLevel++) {

            spaces = treeHeight-treeCurrentLevel;

            for (int k=1;k<=spaces;k++) {
                System.out.print(" ");
            }
            for (int k=1;k<=stars;k++) {
                System.out.print("*");
            }
           // System.out.println(" - stars:"+ stars);
            stars = stars+2;
            System.out.println();
            }
        }



}
