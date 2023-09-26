package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Eff
{
    public static void main(String[] args) {
       System.out.println(keyControlHealth(1921071123456L));

    }

    // somme de deux valeurs
    public static int sumTwoValues(int valueOne, int valueTwo){
        return valueOne + valueTwo;
    }


        // l'utilisateur , saisie deux valeurs et on affiche la somme
        // nous pouvons varier cela avec une soustraction ou encore multiplication    public static void main( String[] args )
        //    {
    public static void userWriteSum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre premier chiffre");
        int saisie = sc.nextInt();
        System.out.println("Entrez votre deuxième chiffre");
        int saisieDeux = sc.nextInt();
        System.out.println(sumTwoValues(saisie,saisieDeux));
    }

    public static int showMaxValue(int valueOne, int valueTwo){
        // affichage de la valeur la plus elevée
        return Math.max(valueOne,valueTwo);
    }




    //l'utilisateur saisi son age, dans un nombre entier et on lui affiche un texte selon son age
    // si son age est à 18 ou plus : "Vous êtes majeur" , sinon, "vous êtes mineur !"
    public static String majorOrNotMajor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre âge");
        int age = sc.nextInt();
       String result = age >= 18 ? "Vous êtes majeur": "Vous êtes mineur";
       return result;
    }

    // je prend un nombre n , tant qu'i lest different de 1 je fais le calcul suivant :
    //pair : divise par 2
    //impair ; on le multiplie par 3 et on ajoute 1
    //enfin on affiche combien de fois nous sommes passé dans la boucle
    //comptabiliser le nombre de number >=10 a la suite et le stocker dans counter
    public static int syracuse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int number = sc.nextInt();
        int counter=0;
        int serie=0;

        while(number!=1){

            if (number>=10){
                counter++;
            }else {
                if (counter > serie) {
                    serie = counter;
                    counter = 0;
                }

            }

            if(number%2==0){
                number/=2;
            }else{
                number = number*3+1;
            }


        }

        return serie;
    }




        //José va bientot passer son bac, il effectue en ce moment une anti-seche en Java qui lui permet de lui donner
        // la longueur de l'hypothenuse
        // vous devez utiliser le théorème de Pythagore et afficher la longueur de l'hypothenuse
    public static double pythagore(float coteUn, float coteDeux){
    double hypothenuse = Math.sqrt(Math.pow(coteUn,2)+Math.pow(coteDeux,2));
    return hypothenuse;
    }



// José, désire un programme qui permet de lui donner la mention en fonction de la note
// Vous devrez concevoir un algorithme qui demandera une note à l'utilisateur et affichera un texte selon le bareme
        // en dessous de 8 : refusé
// entre 8 inclus et 10 exclus : rattrapage
// entre 10 inclus et 12 exlus : pas de mention
// entre 12 inclus et 14 exclus : mention assez bien
// entre 14 inclus et 16 exclus : mention bien
// au dela de 16 inclus : très bien
    public static void mentionBac(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez votre note:");
    float saisie = sc.nextFloat();
    if(saisie<8) {
        System.out.println("Vous êtres recalé");
    } else if (saisie>=8 && saisie<10) {
        System.out.println("Vous êtes en rattrapage");
    } else if (saisie>=10 && saisie<12) {
        System.out.println("Vous êtres admis");
    } else if (saisie>=12 && saisie<14) {
        System.out.println("Félicitation! Vous avez la mention assez-bien");
    } else if (saisie>=14 && saisie<16) {
        System.out.println("Félicitation! Vous avez la mention bien");
    }else{
        System.out.println("Félicitation! Vous avez la mention trés bien");
    }

    }



//José, après avoir eu son bac, a fait une grosse fete
// il culpabilise car il a trop mangé et souhaite connaitre son IMC.
        // demander les le poid ainsi que la taille à l'utilisateur et affichez son IMC
        // L'imc est le poid (en kg) divisé ar la taille (en m) au carré.
    public static float imc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre poids en kg:");
        float poids = sc.nextFloat();
        System.out.println("Entrez votre taille en mètre:");
        float taille = sc.nextFloat();
        float imc = poids/(float)Math.pow(taille,2);
        return imc;
    }


    // l'utilisateur doit saisir un nombre entier: on lui affiche s'il est pair ou impair
    // pair si quand il est divisé par deux, le reste est de 0
    public static String pairOrImpair(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre entier");
        int number = sc.nextInt();
        if(number % 2 == 0){
            return "Pair";
        }else{
            return "impair";

        }

    }

    // on demande à l'utilisateur un nombre entier, on lui affiche s'il est premier ou non
    // regle : un nombre est premier seulement s'il est divisible par 1 et lui-même , 1 exclu
    public static String premierOrNotPremier(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre entier");
        int number = sc.nextInt();
        if(number<=1 ){
            return "Ce nombre n'est pas premier";
        }
        for(int i=2; i<number; i++){
                if(number%i==0){
                    return "Ce nombre n'est pas premier";
        }

        }
            return  "Ce nombre est premier";

    }



    // division, attention au 0
    // Pour rappel, une division par 0 est interdite
    public static String divisionTwoValues(int numerator, int denumerator){
        if(denumerator!=0){
            return "Le resultat est " + (float) numerator/denumerator;
        }else {
            return "On ne peut pas faire une division avec un dénominateur équivalent à 0";
        }
    }



//José est revenu pour nous tester un peu !
        // Il a constaté que vous avez fait pas mal d'exercice en Java.
        // Ainsi, il vous demande de lui donner la clef de controle de sa carte de sécurité sociale
// la clef de controle = 97 - (numero de sécurité sociale modulo 97) (le numero de securité sociale est de 13 chiffres)
        // exemple : pour le code sécurité sociale 1921071123456 la clef est de 15.
    public static long keyControlHealth(long securiteSocialNum){
        long key =  97- (securiteSocialNum % 97);
        return key;
    }

}

