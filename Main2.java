package oblig2;

/*
Lag et program som beregner og skriver ut summen av alle tall mellom to grenser som brukeren skriver inn.
Programmet skal starte med å lese inn nedre og øvre grense for summen. Dersom innlest øvre grense er mindre
enn eller lik nedre grense, skal programmet skrive ut en melding til brukeren om dette og foreta ny innlesing.
Når godkjente grenser er lest inn, skal programmet beregne nevnte sum og summen skal så skrive den ut som en sum.
Hvis f. eks. nedre grense er 2 og øvre grense er 8 skal det skrives ut følgende tekst: "2 + 3 + 4 + 5 + 6 + 7 + 8 = 35".
Test ut programmet med nedre grense lik 1 og øvre grense lik 100. Legg inn et linjeskift for hvert 10. tall i summen.
 */

import static javax.swing.JOptionPane.*;

    class oblig2 {
        public static void main(String[] args) {

            String tall1 = showInputDialog("Skriv inn et tall mellom 1 og 100, som øvre grense");
            String tall2 = showInputDialog("Skriv inn et tall til mellom 1 og 100, som nedre grense");

            int ovreGrense = Integer.parseInt(tall1);
            int nedreGrense = Integer.parseInt(tall2);

            while (ovreGrense <= nedreGrense) {
                showMessageDialog(null, "Øvre grense kan ikke være mindre enn eller lik nedre grense");
                String tall3 = showInputDialog("Skriv inn ny øvre grense");
                int nyOvreGrense = Integer.parseInt(tall3);
            }
            int sum = 0;


            int counter = 0;
            for (int i = nedreGrense; i < ovreGrense; i++) {
                sum = sum + i;
                counter++;
                if(counter %10==0){
                    System.out.println();
                }
                System.out.print(i + " + ");
            }

            sum = sum + ovreGrense;
            System.out.print(ovreGrense + " = " + sum);
        }
    }

