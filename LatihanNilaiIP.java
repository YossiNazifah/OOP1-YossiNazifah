package latihannilaiip;

import java.util.Scanner;

public class LatihanNilaiIP {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valid = 0;
        
        double ip;
        LatihanNilaiIP range = new LatihanNilaiIP();
        
        ip = input.nextDouble();
        
        while(ip != -999) {
            ip = input.nextDouble();
            if (range.isWithinRange(ip, 0, 4) == 1) {
            valid++;
        }
     }
  }
}