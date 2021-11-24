package oppgave2;

import static javax.swing.JOptionPane.*;

class Tallspill
{
    public int nyttTall() {
        int tall = (int) (Math.random() * 201);
        return tall;
        // Trekker og returnerer et slumptall mellom 0 og 200.
        // Tips bruk : (int) (Math.random() * 201), som gir verdier mellom 0 og 200
    }

    public void visMelding(String melding){
        String meldingUt = showInputDialog("Jeg tenker på et tall mellom 0 og 200." + "\n" + " Prøv å gjette på tallet.");
        // Viser parameterens innhold i en meldingsboks.
    }

    private void forLite(int tall){
        String meldingForLite = showMessageDialog(null, tall + " er for lite! Prøv igjen!");
    /* Viser melding om at parameterens verdi er for
       lite tall og ber spilleren prøve igjen. */
    }

    private void forStort(int tall) {
        String meldingForStort = showMessageDialog(null, tall + " er for stort! Prøv igjen!");
    /* Viser melding om at parameterens verdi er for
      stort tall og ber spilleren prøve igjen. */
    }

    public void avsluttRunde(int antall, int gjetning) {
        String meldingAvslutt = showMessageDialog(null, gjetning +
                " er riktig!" + "\n" + " Du gjettet riktig på " + antall + " forsøk.");

        /* Viser melding om at det ble gjettet riktig
      og antall gjetninger som ble brukt.
      Parametrene gir opplysninger om dette. */
    }

    public void kjørSpill() {
    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */
        
    }
}
