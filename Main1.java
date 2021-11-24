package oppgave1;

import static javax.swing.JOptionPane.*;

class Main1 {
    public static void main(String[] args) {
        //Ber bruker skrive inn øvre og nedre grense
        String tall1 = showInputDialog("Skriv inn et tall mellom 1 og 100, som øvre grense");
        String tall2 = showInputDialog("Skriv inn et tall til mellom 1 og 100, som nedre grense");

        //Definerer grensene som tall
        int ovreGrense = Integer.parseInt(tall1);;
        int nedreGrense = Integer.parseInt(tall2);;

        //While-løkke som sjekker og skriver ut, hvis øvregrense er mindre eller lik nedregrense
        while (ovreGrense <= nedreGrense) {
            showMessageDialog(null, "Øvre grense kan ikke være mindre enn eller lik nedre grense");
            String tall3 = showInputDialog("Skriv inn ny øvre grense");
            int NyOvreGrense = Integer.parseInt(tall3);
        }

        int sum = 0;

        //For-løkke for å finne alle tall mellom øvre- og nedregrense
        int counter = 0;
        for (int i = nedreGrense; i < ovreGrense; i++) {
            sum = sum + i;
            //Teller for linjeskift per 10. tall
            counter++;
            if(counter %10==0){
                System.out.println();
            }
            System.out.print(i + " + ");
        }

        //Summerer tallene mellom øvre- og nedregrense, og skriver ut
        sum = sum + ovreGrense;
        System.out.print(ovreGrense + " = " + sum);
    }
}