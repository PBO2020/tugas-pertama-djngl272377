package kopi.mesin;
import java.util.Scanner;
import java.util.ArrayList;
public class KopiMesin {
    public static void main(String[] args) {
    KopiMesin x = new KopiMesin();
    x.coffe();
    }
    public void coffe(){
    ArrayList<Vending> kopi = new ArrayList<>();
    ArrayList<Vending2> toping = new ArrayList<>();
    Vending arabica = new Vending();
    Vending robusta = new Vending();
    Vending flora = new Vending();
    Vending2 cream = new Vending2();
    Vending2 milk = new Vending2();
    Vending2 brown = new Vending2();
    Scanner keyboard = new Scanner(System.in);
//    arabica
    arabica.setnamakopi("Arabica");
    arabica.setasalkopi("Timur Tengah");
    arabica.setstokkopi(20);
    kopi.add(arabica);
//    robusta
    robusta.setnamakopi("Robusta");
    robusta.setasalkopi("Eropa");
    robusta.setstokkopi(20);
    kopi.add(robusta);
//    flora
    flora.setnamakopi("Flora");
    flora.setasalkopi("Asia");
    flora.setstokkopi(20);
    kopi.add(flora);
//    toping
    milk.setnamatoping("Milk");
    milk.setstoktoping(20);
    toping.add(milk);
    
    cream.setnamatoping("Choco");
    cream.setstoktoping(20);
    toping.add(cream);
    
    brown.setnamatoping("Whiped Cream");
    brown.setstoktoping(20);
    toping.add(brown);
    System.out.println("Coffe Menu : :");
    for(int i=0; i< kopi.size();i++){
        int j= i+1;
        System.out.println("\t"+j+" "+kopi.get(i).getnamakopi());
    }
    System.out.println("Menu Toping : ");
    for(int i=0; i< kopi.size();i++){
        int j= i+1;
        System.out.println("\t" +j+ " "+toping.get(i).getnamatoping());
    }
    try{
    kopi.size();
    toping.size();
    System.out.println("Put Coffe What You Choose ");
        System.out.print("Enter :");
        int pilihanKopi = keyboard.nextInt() -1;
        System.out.println("Your Order is Coffe "+kopi.get(pilihanKopi).getnamakopi()+" -> " +kopi.get(pilihanKopi).getasalkopi());
        System.out.println("Stock Avaliable " +kopi.get(pilihanKopi).getstokkopi());
    } catch (Exception e){
        System.out.println("\nWrong Code");
        System.out.println(e+"\n");
        coffe();
    }
    }
}