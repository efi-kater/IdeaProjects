package HwL5;

import java.util.ArrayList;
import java.util.Map;
import java.util.*;

public class HwL5Main {
    public static void main(String[] args) {
        String names[] = {"Efi","Lea","Anna"};
        names[1]= "Lea Lilach";

        ArrayList<String> nameArList = new ArrayList<>();
        for (int i=0;i< names.length;i++){
            nameArList.add(names[i]);
        }

        for (int i=0;i< nameArList.size();i++){
            if (i!=1){
                continue;
            }
            else {
                System.out.println(nameArList.get(i));
            }
        }
        System.out.println(nameArList.size());

        Dog dogA = new Dog("Labrador", "doggy", 12);
        Dog dogB = new Dog("Poodle", "puffy", 10);
        ArrayList<Dog> dogArrayList = new ArrayList<>();
        dogArrayList.add(dogA);
        dogArrayList.add(dogB);
        for (int i =0; i<dogArrayList.size();i++){
            System.out.println(dogArrayList.get(i).getDogType() +" "+ dogArrayList.get(i).getDogName()+ " "+dogArrayList.get(i).getDogAge());
        }
        System.out.println(dogArrayList.size());
        dogArrayList.clear();
        System.out.println(dogArrayList.size());

        int intArray[] ={0,100,56,32,-15,3222};
        int average = 0;
        for (int i=0; i<intArray.length;i++){
            average+=intArray[i];
        }
        System.out.println((double)average/intArray.length);

        Map<String, String> users = new HashMap<>();
        for (int i=0;i< nameArList.size();i++){
            users.put(nameArList.get(i), intArray[i]+"aaa");


        }
        System.out.println(users);        System.out.println("Enter a number between 1-4 please.");
        Scanner a = new Scanner(System.in);
        int choise=a.nextInt();
        switch (choise) {
            case 1:
                System.out.println(SeasonEnum.Winter);
                break;
            case 2:
                System.out.println(SeasonEnum.Spring);
                break;
            case 3:
                System.out.println(SeasonEnum.Summer);
                break;
            case 4:
                System.out.println(SeasonEnum.Fall);
                break;
        }
        int intArray2 []= new int[6];
        for (int i=0;i<5;i++){
            System.out.println("enter the next number");
            a = new Scanner(System.in);
            intArray2[i]=a.nextInt();
        }
        for (int i =0; i<intArray2.length;i++){
            System.out.println(intArray2[i]);
            System.out.println(intArray2[i]==67);
        }

        try {
            throw new MyExceptionClass();
        } catch (MyExceptionClass m){
            m.printStackTrace();
        }
    }
}
