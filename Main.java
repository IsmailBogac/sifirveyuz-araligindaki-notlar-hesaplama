import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik,toplamDersSayisi=0;
        double toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if (mat >  0 && mat <=100 ){
            toplam += mat;
            toplamDersSayisi++;
        }else {
            System.out.println("Geçersiz not girdiniz !!");
        }
        System.out.print("Fizik notunuzu giriniz :");
        fizik = input.nextInt();
        if (fizik > 0 && fizik <= 100){
            toplam += fizik;
            toplamDersSayisi++;
        }else {
            System.out.println("Geçersiz not girdiniz !!");
        }
        System.out.print("Türkçe notunuzu giriniz :");
        turkce = input.nextInt();
        if (turkce >0 && turkce <=100){
            toplam+=turkce;
            toplamDersSayisi++;
        }else {
            System.out.println("Geçersiz not girdiniz !!");
        }
        System.out.print("Kimya notunuzu giriniz :");
        kimya = input.nextInt();
        if (kimya >0 && kimya <=100){
            toplam += kimya;
            toplamDersSayisi++;
        }else {
            System.out.println("Geçersiz not girdiniz !!");
        }
        System.out.print("Müzik notunuzu giriniz :");
        muzik = input.nextInt();
        if (muzik >0 && muzik <= 100){
            toplam += kimya;
            toplamDersSayisi++;
        }else {
            System.out.println("Geçersiz not girdiniz !!");
        }

        double avarage =toplam/toplamDersSayisi;
        avarage= (mat+fizik+turkce+kimya+muzik) / 5 ;
        if (avarage <= 55){
            System.out.println("Maalesef Sınıfta Kaldınız :(");
        }else {
            System.out.println("Tebrikler Sınıfı Geçtiniz :)");
        }

        System.out.print("Ortalamanız :"+avarage);
    }
}