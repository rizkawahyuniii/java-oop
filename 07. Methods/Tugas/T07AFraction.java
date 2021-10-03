// File: T07AFraction.java
public class T07AFraction {
  // bagian ide/ algoritma
    static void sumFraction(int e1, int e2, int d1, int d2) {
        int es = (e1 * d2 + e2 * d1);
        int ds = (d1 * d2);

        //Hasil pecahan
        printFraction(es, ds); 
    }
    static void productFraction(int e1, int e2, int d1, int d2) {
        int ep = (e1 * e2);
        int dp = (d1 * d2);

        //Hasil pecahan
        printFraction(ep, dp);
    }
    static int fpbPenyebut(int a, int b){
        //jika b=0, akan mengembalikan nilai a yang mana a adalah fpb untuk myederhanakan bilangan
        if(b == 0){
            return a;
        }
        //jika b tidak sama dengan 0, maka akan mengembalikan ke method fpb. 
        else{
            return fpbPenyebut(b, a % b);
        }
    }
    static void printFraction(int e, int d){
        //int x ialah untuk nilai fpb penyebut sehingga bisa menyederhanakan pecahan
        int x = fpbPenyebut(e, d);

        //Sederhanakan pecahan biasa
        e = e / x;
        d = d / x;

        //Hasil akhir pecahan
        if (e == d || d == 1) {
            int ed = e / d;
            System.out.println(ed);
        }
        else{
            System.out.println(e+"/"+d);
        }
    }
    public static void main(String[] args) {
        sumFraction(1, 2, 2, 3);
        sumFraction(1, 3, 3, 4);
        productFraction(1, 2, 2, 3);
        productFraction(1, 4, 2, 3);
    }
    
}
