public class Rettangolo extends Forma{
    Rettangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    void calcolaArea() {
        int area = base * altezza;
        System.out.println(area);
    }
}
