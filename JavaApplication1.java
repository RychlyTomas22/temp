/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author tomas.rychly
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
import java.util.Scanner;

/**
 *
 * @author tomir
 */
public class VypisCeleCislo {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int cislo = sc.nextInt();
        char x;

        if (cislo >= 0) {
            x = '+';
        } else {
            x = '-';
        }

        int z = Math.abs(cislo);

        if (z >= 10 && z < 100) {
            System.out.println(x + "0" + z);
            
        } else if (z >= 100) {
            
            System.out.println(x + "" + z);
            
        } else {
            
            System.out.println(x + "00" + z);
        }

    }

}
 //*********************************


import java.util.Scanner;

/**
 *
 * @author tomir
 */
public class TabulkaPozice {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //radek
        int n = sc.nextInt();
        //sloupec
        int m = sc.nextInt();
        int por = sc.nextInt();

        int a = 1;

        int[][] x = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                x[i][j] = a;
                a++;

                if (x[i][j] == por) {
                    System.out.print(i + 1 + " ");
                    System.out.println(j + 1);
                }

            }
        }

    }

}
//*******************************


import java.util.Scanner;

/**
 *
 * @author tomir
 */
public class TabulkaPoradi {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //radek
        int n = sc.nextInt();
        //sloupec
        int m = sc.nextInt();
        //cis radku
        int x = sc.nextInt();
        //cis sloupce
        int y = sc.nextInt();

        int a = 1;

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = a;
                a++;   
            }
        }
        
        
         System.out.println(arr[x-1][y-1]);
    }

}
//*******************************

import java.util.Scanner;

public class PrevodSekund {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sekundy = sc.nextInt();
        int h, m, s;
        
        

     h = sekundy / 3600;
     m = (sekundy % 3600) / 60;
     s = sekundy % 60;

    System.out.printf("%02d:%02d:%02d", h, m, s);
        
        
       
    }
    
}
//******************************

// prum teplota
import java.util.Scanner;
import java.util.Locale;

public class PrumernaDenniTeplota {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        float prumernaTeplota; 
        // zde doplnit potrebny kod - nacteni a vypocet
        
        
        System.out.format(Locale.US, "%1.2f", prumernaTeplota);
    }
}
//******************************


import java.util.Scanner;

public class CtyriCisla {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            //392 26 8 4
            // Read in the four integers
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            // Sort the four integers in ascending order
            int tmp;
            if (a > b) {
                tmp = a;
                a = b;
                b = tmp;
            }
            if (c > d) {
                tmp = c;
                c = d;
                d = tmp;
            }
            if (a > c) {
                tmp = a;
                a = c;
                c = tmp;
            }
            if (b > d) {
                tmp = b;
                b = d;
                d = tmp;
            }
            if (b > c) {
                tmp = b;
                b = c;
                c = tmp;
            }
            System.out.println(a + " " + b + " " + c + " " + d);

        }
    }
}
//******************************

import java.util.Scanner;


public class BarvaPole {
      public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int x = sc.nextInt();
      
                 if (x < 0) {
            break;
        }
      
      
      int y = sc.nextInt();
      


      if ((x + y) % 2 == 0) {
        System.out.println("BILA");
      } else {
        System.out.println("CERNA");
      }
   
    }
  }
    
}
//******************************

import java.util.Scanner;

public class DelitelNasobek {
    
           public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            long a = scanner.nextInt();
            if (a <= 0) {
                break;
            }
            long b = scanner.nextInt();

            long gcd = gcd(a, b);

            long lcm = (a * b) / gcd;

            System.out.println(gcd + " " + lcm);
        }

    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
//******************************

import java.util.Scanner;

public class RozkladCisla {
    
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    while (num > 0) {
      String result = "";

      int divisor = 2;
      while (num % divisor != 0) {
        divisor++;
      }

      while (num % divisor == 0) {
        result += divisor + " ";
        num /= divisor;
      }

      while (num > 1) {
        divisor = 2;
        while (num % divisor != 0) {
          divisor++;
        }
        result += divisor + " ";
        num /= divisor;
      }

      System.out.println(result);

      num = sc.nextInt();
    }
  }
}
//******************************

import java.util.Scanner;

public class Cifry {
    
      public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      long num = scanner.nextLong();

      if (num <= 0) {
        break;
      }

      int sum = 0;
      long product = 1;

      while (num > 0) {
        int digit = (int)(num % 10);
        sum += digit;
        product *= digit;
        num /= 10;
      }

      System.out.println(sum);
      System.out.println(product);
    }

    scanner.close();
  }
}
//******************************

import java.util.Scanner;
import java.util.Locale;


public class PoctyBodu {
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US); // set the decimal separator to '.'

    int n = sc.nextInt(); // read the number of points

    // initialize the counters for each quadrant
    int quadrant1 = 0;
    int quadrant2 = 0;
    int quadrant3 = 0;
    int quadrant4 = 0;

    for (int i = 0; i < n; i++) {
      double x = sc.nextDouble();
      double y = sc.nextDouble();

      // check which quadrant the point belongs to and increase the corresponding counter
      if (x > 0 && y >= 0 || x == 0 && y >= 0) {
        quadrant1++;
      } else if (x < 0 && y > 0 || y == 0 && x < 0) {
        quadrant2++;
      } else if (x < 0 && y < 0 || x == 0 && y < 0) {
        quadrant3++;
      } else if (x > 0 && y < 0) {
        quadrant4++;
      }
    }

    // print the results
    System.out.println(quadrant1 + " " + quadrant2 + " " + quadrant3 + " " + quadrant4);
  }
}

// konec



//212313
    }
    
}
