import java.io.*;
public class Contact implements Serializable {
    private String nume, prenume, mobil, email;    
    
    public Contact(String nume, String prenume, String mobil, String email){
        this.nume = nume;
        this.prenume = prenume;
        this.mobil = mobil;
        this.email = email;
    }
    
    public String toString(){
        return nume + " " + prenume + " " + mobil + " " + email;
    }
    
    public String getNume(){
        return this.nume;    
    }
    
    public void setNume(String nume){
        this.nume = nume;
    }
    
    public String getPrenume(){
        return this.prenume;
    }
    
    public void setPrenume(String prenume){
        this.prenume = prenume;
    }
    
    public String getMobil(){
        return this.mobil;
    }
    
    public void setMobil(String mobil){
        this.mobil = mobil;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
}