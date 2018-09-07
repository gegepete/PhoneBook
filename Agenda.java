import java.util.*;
import java.io.*;
public class Agenda {
    private static Agenda SINGLETON;
    private List<Contact> contacte = new ArrayList<>();
    
    private Agenda(){
    }
    
    public static Agenda getInstance(){
        if(SINGLETON == null){
            SINGLETON = new Agenda();
        }
        return SINGLETON;
    }
    
    public void scrieFisier(){
        try(
            FileOutputStream fos = new FileOutputStream("E:/contacte");
            ObjectOutputStream out = new ObjectOutputStream(fos);
        ){
            out.writeObject(contacte);
        }catch(IOException e){
            e.printStackTrace();
        }  
    }
    
    public void citesteFisier(){
        try(
            FileInputStream fis = new FileInputStream("E:/contacte");
            ObjectInputStream in = new ObjectInputStream(fis);
        ){
            contacte = (List<Contact>) in.readObject();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void adaugaContact(Contact c){        
        contacte.add(c);
        scrieFisier();
    }
    
    public void afiseazaContacte(){
        citesteFisier();
        for (int i = 1; i < contacte.size(); i++) {
            System.out.println(i + " " + contacte.get(i));
        }
    }
    
    public void stergeContact(int index){
        contacte.remove(index);
        scrieFisier();      
        System.out.println("Contactul a fost sters.");
    }
}
