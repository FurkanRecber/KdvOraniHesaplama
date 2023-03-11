import java.util.Scanner;

public class KdvOraniHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, fiyat, kdvOrani1 = 0.18, kdvOrani2 = 0.08;
        System.out.printf("Ürünün tutarını giriniz: ");
        tutar = input.nextDouble();

        if ((0 < tutar) && (tutar < 1000)) {
            fiyat = tutar + (tutar * kdvOrani1);
            System.out.println("Ürününüzün fiyatı: " + fiyat + "TL");
        } else if (tutar >= 1000) {
            fiyat = tutar + (tutar * kdvOrani2);
            System.out.println("Ürününüzün fiyatı: " + fiyat + "TL");
        } else System.out.println("Yanlış bir tutar girdiniz. Tekrar deneyiniz!");
    }
}
