import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         
    int m = sc.nextInt();

    BitSet b1 = new BitSet(n);
    BitSet b2 = new BitSet(n);

    for (int i = 0; i < m; i++) {
      String output = sc.next();
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();

      switch(output) {
        case "AND":
        if(num1==1 && num2==2){
            b1.and(b2);
        }else if(num1==2 && num2==1){
            b2.and(b1);
        }else if(num1==1 && num2==1){
            b1.and(b1);
        }else if(num1 ==2 && num2== 2){
            b2.and(b1);
        }
        break;
          
          
        case "OR":
        if(num1==1 && num2==2){
            b1.or(b2);
        }else if(num1==2 && num2==1){
            b2.or(b1);
        }else if(num1==1 && num2==1){
            b1.or(b1);
        }else if(num1 ==2 && num2== 2){
            b2.or(b1);
        }
        break;
        case "XOR":
          if(num1==1 && num2==2){
            b1.xor(b2);
        }else if(num1==2 && num2==1){
            b2.xor(b1);
        }else if(num1==1 && num2==1){
            b1.xor(b1);
        }else if(num1 ==2 && num2== 2){
            b2.xor(b1);
        }
        break;
        
        
        case "FLIP":
          if (num1==1) {
            b1.flip(num2);
          } else if (num1== 2) {
            b2.flip(num2);
          }
          break;
        case "SET":
          if (num1 ==1) {
            b1.set(num2);
          } else if (num1==2) {
            b2.set(num2);
          }
          break;
      }
      System.out.println(b1.cardinality() + " " + b2.cardinality());
   //cardinality used to return values that are true
    }
    }
    }
