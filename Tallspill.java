package oppgave2;

import static javax.swing.JOptionPane.*;

class Tallspill
{
    public int nyttTall() {
        // Trekker og returnerer et slumptall mellom 0 og 200
        int tall = (int) (Math.random() * 201);
        return tall;
    }

    public void visMelding(String melding){
        // Viser parameterens innhold i en meldingsboks
        showMessageDialog(null, melding);
    }

    private void forLite(int tall){
        //Viser melding om at parameterens verdi er for lite tall og ber spilleren prøve igjen
        visMelding(tall + " er for lite! Prøv igjen!");
    }

    private void forStort(int tall) {
        //Viser melding om at parameterens verdi er for stort tall og ber spilleren prøve igjen
        visMelding(tall + " er for stort! Prøv igjen!");
    }

    public void avsluttRunde(int antall, int gjetning) {
        //Viser melding om at det ble gjettet riktig og antall gjetninger som ble brukt. Parametrene gir opplysninger om dette.
        visMelding(gjetning + " er riktig!" + "\n" + " Du gjettet riktig på " + antall + " forsøk.");
    }

    public void kjørSpill() {
    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */
        int nyttTall = nyttTall();
        int teller = 0;

        boolean riktig = false;

        while (riktig == false){
            teller++;

            String gjetning = showInputDialog("Jeg tenker på et tall mellom 0 og 200." + "\n" + " Prøv å gjette på tallet.");

            //Tester at det skrives inn tall
            try{
                Integer gjetningTall = Integer.parseInt(gjetning);
            }
            catch (Exception e){
                Integer gjetningTall = 0;
                visMelding("Tallet må være et heltall!");
                System.exit(1);
            }

            //Definer som tall
            int gjetningTall = Integer.parseInt(gjetning);

            //Tester om tallet er for stort, for lite eller riktig og avslutter hvis riktig.
            if (gjetningTall == nyttTall){
                avsluttRunde(teller, gjetningTall);
                riktig = true;
            }
            else if (gjetningTall < nyttTall){
                forLite(gjetningTall);
            }
            else if (gjetningTall > nyttTall){
                forStort(gjetningTall);
            }
        }
    }
}
