import java.util.*;
import java.lang.*;
import java.io.*;

class PriemzahlenRechner{
  
  public static void main(String[] args) throws java.lang.Exception {
  
    // berechne die Priemzahlen bis 1000
    printPrimes(1000);
  
  }
  
  static void printPrimes(int max){
    //neues boolean setzen
    boolean[] sieve = new boolean[max +1];
    int i,j;
    for(i=2; i<=max; i++) sive[i] = true;
    i=2;
    while(i<=max) { // solange i kleiner oder gleich max ist
      // die Priemzahlen ausgeben
      System.out.println(i + " "); // i ist die Priemzahl
      for(j = i; j<= max; j=j+i)sieve[j] = flase;
      while (i <= max && !sieve[i]) i++;
  
    }
  }
}
