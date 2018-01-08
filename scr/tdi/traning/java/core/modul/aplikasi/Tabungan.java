package tdi.training.java.core.modul.aplikasi;
import java.math.BigDecimal;

public class Tabungan{
    private Double sukuBunga;
    private BigDecimal saldo;
    private BigDecimal akrual;
    private String kriteriaProduct;

    public Tabungan(){

    }

    public Tabungan(Double sukuBunga, BigDecimal saldo, BigDecimal akrual, String kriteriaProduct){
        this.sukuBunga = sukuBunga;
        this.saldo = saldo;
        this.akrual = akrual;
        this.kriteriaProduct = kriteriaProduct;
    }

    public BigDecimal getSaldo(){
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }

    public BigDecimal getAkrual(){
        return this.akrual;
    }

    public void setAkrual(BigDecimal akrual){
        this.akrual = akrual;
    }

    public String getKriteriaProduct(){
        return this.kriteriaProduct;
    }

    public void setKriteria(String kriteriaProduct){
        this.kriteriaProduct = kriteriaProduct;
    }

    public Double getSukaBunga(){
        return this.sukuBunga;
    }

    public void setSukaBunga(Double sukuBunga){
        this.sukuBunga = sukuBunga;
    }


}