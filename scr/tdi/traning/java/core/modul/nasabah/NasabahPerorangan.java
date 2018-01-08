package tdi.training.java.core.modul.nasabah;
import tdi.training.java.core.modul.aplikasi.Tabungan;
import java.math.BigDecimal;

public class NasabahPerorangan extends Nasabah{

    private String namaLengkap;
    private String alamatRumah;
    private String nomorHp;
    private String foto;
    private Tabungan tabungan;

    public NasabahPerorangan(String noIdentitas, String namaLengkap, String alamatRumah, String nomorHp, String foto ){
        
        this.namaLengkap = namaLengkap;
        this.alamatRumah = alamatRumah;
        this.nomorHp = nomorHp;
        super.setNoldentitas(noIdentitas);
        super.setActive(false);
        super.setSaldo(BigDecimal.ZERO);

        this.tabungan = new Tabungan(0.1d, new BigDecimal(0), new BigDecimal(0),"Tabungan Mampan");

        
    }
    

    public String getNamaLengkap(){
        return this.namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap){ 
        this.namaLengkap = namaLengkap;
    }

    public String getAlamatRumah(){
        return this.alamatRumah;
    }

    public void setAlamatRumah(){ 
        this.alamatRumah = alamatRumah;
    }

    public String getNomorHp(){
        return this.nomorHp;
    }

    public void setNomorHp(){
        this.nomorHp = nomorHp;
    }

    public String getFoto(){
        return this.foto;
    }

    public void setFoto(){
        this.foto = foto;
    }

     public Tabungan getTabungan(){
        return this.tabungan;
    }

    public void setTabungan(){
        this.tabungan = tabungan;
    }

    public String toString(){
        return String.format("nasabah [noIdentitas:%s, status: %s,namaLengkap: %s, saldo tabungan: %s]",
         super.getNoldentitas() ,super.getActive(), this.namaLengkap,this.getTabungan(),getSaldo());
    }






}