package test;

import domain.Exercise;
import java.util.Scanner;

public class TestResult 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.print("Введіть довжину масива = ");
        String n = in.nextLine();
        int N = Integer.parseInt(n.trim());
        
        int[] array = new int[N];
        System.out.println("Ваш масив:");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = ((int)(Math.random()*100));
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.println("Друге за величиною число масива = "+Exercise.Calculate(array));
    }
}
