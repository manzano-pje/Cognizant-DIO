
public class HoraDoDia {
    public static void main(String[] args) {
        manha(9);
        tarde(15);
        noite(20);
    }

    public static void manha(int i) {
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("hora = "+i+" Bom dia !");
                break;
        }
    }
    public static void tarde(int i) {
        switch (i) {
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                System.out.println("hora = "+i+" Boa tarde !");
                break;
        }
    }
    public static void noite(int i){
        switch (i){
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:System.out.println("hora = "+i+" Boa noite !");
            break;
        }
    }

}
