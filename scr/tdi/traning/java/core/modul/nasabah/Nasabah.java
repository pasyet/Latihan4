package tdi.training.java.core.modul.nasabah;
import java.math.BigDecimal;

public class Nasabah{
    
    private String noldentitas;
    private Boolean active;
    private BigDecimal saldo;

    public String getNoldentitas(){
        return this.noldentitas;
    }

    public void setNoldentitas(String noldentitas){
        this.noldentitas = noldentitas;
    }

    public Boolean getActive(){
        return this.active;
    }

    public void setActive (Boolean active){
        this.active = active;
    }

    public BigDecimal getSaldo(){
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }



} 