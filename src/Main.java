//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(4,3);
        Triangolo triangolo = new Triangolo(6,2);
        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}

//Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo astratto chiamato
// calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed implementano il metodo per
// il calcolo dell'area in maniera specifica.