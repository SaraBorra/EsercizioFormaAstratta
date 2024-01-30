public class Triangolo extends Forma{
    Triangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    void calcolaArea() {
        int area = base * altezza / 2;
        System.out.println(area);
    }
}
