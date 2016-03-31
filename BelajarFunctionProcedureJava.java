package belajarfunctionprocedure.java;
    
public class BelajarFunctionProcedureJava {
    
    public static void main(String[] args) {
        BelajarFunctionProcedureJava belajar = new BelajarFunctionProcedureJava();
        belajar.tambah(1, 2);
        belajar.kurang(5, 1);
        belajar.kali(3, 3);
        belajar.bagi(4, 2);
    }
    
    private void tambah(int a, int b) {
        int hasil;
        hasil = a + b;
        System.out.println(hasil);
    }
    
    private void kurang(int a, int b) {
        int hasil;
        hasil = a - b;
        System.out.println(hasil);
    }
    
    private void kali(int a, int b) {
        int hasil;
        hasil = a * b;
        System.out.println(hasil);
    }
    
    private void bagi(int a, int b) {
        int hasil;
        hasil = a / b;
        System.out.println(hasil);
    }
    
    private int fungsitambah(int a, int b) {
        return a + b;  
        
    }
}