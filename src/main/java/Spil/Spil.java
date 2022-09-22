package Spil;

import java.util.Scanner;


public class Spil {
    public static void main(String[] args) {

        int spiller_1, spiller_2; // Vi har to spiller
        int spiller_1_point = 0;
        int spiller_2_point = 0;
        int terning_1, terning_2;


        Scanner scan = new Scanner(System.in);

        System.out.println("Kære Spiller, indtast jerse navne: ");
        String spiller_1_navn = scan.nextLine();
        String spiller_2_navn = scan.nextLine();

        System.out.println("Slå terninger: ");

        while (spiller_1_point < 40 || spiller_2_point < 40) {



            if (spiller_1_point < 40 && spiller_2_point < 40) {

                System.out.println(spiller_1_navn + " er din tur: "); // Spilleren skal trykke på 'Enter' for at slå terninger
                scan.nextLine();



                terning_1 = 1 + (int) ((Math.random()) * 6); //Random tal mellem 1 til 6
                terning_2 = 1 + (int) ((Math.random()) * 6); //Random tal mellem 1 til 6

                if (terning_1 == 1 && terning_2 == 1){ // // if spillern nr 1 slå to en, så mister han alle sin pointer
                    System.out.println("Det er ærgeligt! Du har mistet alle dine pointer.");
                    spiller_1_point = 0;
                }


                else
                spiller_1_point += (terning_1 + terning_2); // Summen af terningernes værdier lægges til spilleren nummer ets pointer

                System.out.println(terning_1);
                System.out.println(terning_2);
                System.out.println(spiller_1_navn + " har samlet " + spiller_1_point + " point.");
                System.out.println("");
            }
            else if (spiller_1_point >= 40) {
                System.out.println(" Tillykke " + spiller_1_navn + ", du har vundet spillet!");
                break;
            }


             if (spiller_2_point < 40 && spiller_1_point < 40 ) {

                System.out.println(spiller_2_navn + " er din tur: ");
                scan.nextLine();

                terning_1 = 1 + (int) ((Math.random()) * 6); //Random tal mellem 1 til 6
                terning_2 = 1 + (int) ((Math.random()) * 6); //Random tal mellem 1 til 6

                 if (terning_1 == 1 && terning_2 == 1) { // if spillern nr 2 slå to en, så mister han alle sin pointer
                     System.out.println("Det er ærgeligt! Du har mistet alle dine pointer.");
                     spiller_2_point = 0;
                 }

                 else
                     spiller_2_point += (terning_1 + terning_2); // Summen af terningernes værdier lægges til spilleren nummer tos pointer

                System.out.println(terning_1);
                System.out.println(terning_2);
                System.out.println(spiller_2_navn + " har samlet " + spiller_2_point + " point.");
                 System.out.println("");


            }
            if(spiller_2_point >= 40) {
                System.out.println("Tillykke " + spiller_2_navn + ", du har vundet spillet!");
                break;
            }

        }








    }
}





