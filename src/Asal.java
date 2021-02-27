public class Asal {
    public static void main(String[] args) {

        for (int sayi = 2; sayi <= 100; sayi++) {
            int asal_mi = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asal_mi = 1;
                    break;
                }
            }
            if (asal_mi == 0) {
                System.out.println(sayi + " asal sayıdır ");
            }
        }
}
    }

