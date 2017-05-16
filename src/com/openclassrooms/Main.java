package com.openclassrooms;

import java.util.Scanner;



public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static int searchDicho(int[] tableauChiffre, int nbVal, int val){
        boolean found;
        int left; // int id debut
        int right; // int ifin
        int pivot; // int im milieu

        found = false;
        left = 0;
        right = nbVal;

        /** Boucle de recherche */
        while(!found && ((right-left)>1)){
            pivot = (left + right) / 2;

            found = (tableauChiffre[pivot] == val);

            if(tableauChiffre[pivot] > val) {
                right = pivot;
            }else{
                left = pivot;
            }

        }
        if(tableauChiffre[left] == val) {
            return left;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int val, nbVal;


        int tableauChiffre[] = {12, 14, 20, 25, 26, 28, 35, 99};
        nbVal = 10;


        int response;
        System.out.println("Please enter AILE_1 measure as int :");
        response = Integer.parseInt(scanner.next());

        int indiceReturned = searchDicho(tableauChiffre, nbVal, response);
        if(indiceReturned != -1) {
            System.out.println("Votre valeur est à l'indice : " +indiceReturned);
        }else{
            System.out.println("Votre valeur n'est pas dans le tableau");
        }


    }
}
