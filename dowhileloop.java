package org.example;


     //write programme to print 10 even number using do while loop

public class dowhileloop {

   public static void main (String []args) {
       int a = 2;
       do {
           if (a % 2 == 0) {
               System.out.println(a + "even number");
           }
           a++;

           } while (a <= 18);

       //write a programme to print 10 odd  number using do while loop
       int n = 1;
       do {
           if (n % 2 == 1) {
               System.out.println(n + "odd number");

           }
           n++;
       } while (n <=18);
       //write a programme to generate table of 9 using do while loop

        int num = 9;
           a = 1;
           do {
               System.out.println(num + "*" + a + "=" + num * a);
               a++;

           } while (a <= 10);


       }
   }




