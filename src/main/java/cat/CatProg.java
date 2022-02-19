package cat;

import java.util.Scanner;

public class CatProg {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        Cat cat = new Cat("Muli", 10, "Grey");
        StreetCat streetCat = new StreetCat("Momo", 15, "grey", 10);
        SiamiCat siamiCat = new SiamiCat("bil", 4, "red", "carrot");

        System.out.println("Please enter street cat name, mustage length, mustage color, number of fights ");
        StreetCat inputStreetCat = new StreetCat(input.next(), input.nextInt(), input.next(), input.nextInt());
        System.out.println("Please enter siami cat name, mustage length, mustage color, favorite food ");
        SiamiCat inputSiamiCat = new SiamiCat(input.next(), input.nextInt(), input.next(), input.next());

        System.out.println(cat);
        System.out.println(streetCat);
        System.out.println(siamiCat);
        System.out.println(inputStreetCat);
        System.out.println(inputSiamiCat);
    }
}
