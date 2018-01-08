package tdi.training.java.core;
import tdi.training.java.core.modul.nasabah.NasabahPerorangan;

public class MainApplication{
    public static void main (String[] args){
        NasabahPerorangan yusuf = new NasabahPerorangan(
            "62213424",
            "Muhamad Yusuf",
            "Jl. Ujung berung no 123",
            "08123423434", 
            "kjhjkjh");
            System.out.println(yusuf.toString());
        
    }
}