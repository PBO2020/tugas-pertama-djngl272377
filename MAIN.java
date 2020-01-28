package tugas1;

public class MAIN {

    public static void main(String[] args) {
        System.out.println("Penjumlahan");
        Tugas1 jumlah = new Tugas1();
        jumlah.setangka1(10);
        jumlah.setangka2(10);
        jumlah.setTambah(jumlah.getangka1() + jumlah.getangka2());
        System.out.println(jumlah.getangka1() + "+" + jumlah.getangka2() + " = " + jumlah.getTambah());

        System.out.println("");

        System.out.println("Pengurangan");
        Tugas1 kurang = new Tugas1();
        kurang.setangka1(10);
        kurang.setangka2(10);
        kurang.setTambah(kurang.getangka1() - kurang.getangka2());
        System.out.println(kurang.getangka1() + " - " + kurang.getangka2() + "=" + kurang.getKurang());

        System.out.println("");

        System.out.println("Perkalian");
        Tugas1 kali = new Tugas1();
        kali.setangka1(10);
        kali.setangka2(10);
        kali.setTambah(kali.getangka1() * kali.getangka2());
        System.out.println(kali.getangka1() + "*" + kali.getangka2() + "=" + kali.getKali());
      
        System.out.println("");

        System.out.println("Pembagian");
        Tugas1 bagi = new Tugas1();
        bagi.setangka1(10);
        bagi.setangka2(10);
        bagi.setTambah(bagi.getangka1() / bagi.getangka2());
        System.out.println(bagi.getangka1() + ":" + bagi.getangka2() + "=" + bagi.getbagi());
      }
}
